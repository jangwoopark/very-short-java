import java.io.*;
import java.util.*;

public class Solution{

	private final static int MOD = 1000003;

	public static void main(String[] args) throws IOException{
		final StringBuilder sb = new StringBuilder();
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Get input
		final int N = Integer.parseInt(br.readLine());
		int[] D = new int[N];
		int[] P = new int[N];
		for(int n = 0; n < N; ++n){
			String[] temp = br.readLine().split(" ");
			D[n] = Short.parseShort(temp[1]);
			P[n] = Integer.parseInt(temp[2]);
		}

		//Initialize
		RSQ pSums = new RSQ(P);
        RPQ dpProds = new RPQ(D, P, MOD);
		FactorialCache facts = new FactorialCache(MOD);
        D = null;
        P = null;

		//For each query
		for(int Q = Integer.parseInt(br.readLine()); Q > 0; --Q){
			String[] temp = br.readLine().split(" ");
			final int I = Integer.parseInt(temp[1]) - 1;
			final int J = Integer.parseInt(temp[2]) - 1;
			
			//If update
			if (temp.length > 3){
				final short V = Short.parseShort(temp[3]);
                pSums.update(I, J, V);
                dpProds.update(I, J, V);
			//If query
			} else {
                long V = 0;
				final long K = pSums.get(I, J);
                final long F = facts.get(K);
                if (K > 0){
                    V = (F * dpProds.get(I, J)) % MOD;
                }
				sb.append(K).append(" ").append(V).append("\n");
			}
		}

		//Print
		System.out.print(sb);
	}
    
    private static long pow(final long base, final long power, final int mod){
        if (power < 2L){
            return (power < 1L) ? 1 % mod : base % mod;
        }
        long sq = pow(base, power >> 1L, mod);
        sq = (sq * sq) % mod;
        return ((power & 1L) == 0L) ? sq : (sq * base) % mod;
    }

	public static class FactorialCache{
		
		private int mod;
        private int size;
		private int[] factorials;

		public FactorialCache(int mod){
            this.size = 2;
			this.mod = mod;
			this.factorials = new int[mod];
			factorials[0] = 1;
            factorials[1] = 1;
		}
        
		public int get(long index){

			if (index < 0 || index >= mod){
				return 0;
			}
            
            while (size <= index){
                long prod = size;
                prod = (prod * this.factorials[size - 1]) % this.mod;
                this.factorials[size++] = (int)prod;
            }

			return this.factorials[(int)index];
		}
	}
    
    public static class RSQ{
        private final int length;
        private final long[] data;
        private final long[] lazy;
        
        public RSQ(final int[] A){
            this.length = A.length;
            final int height = (int)Math.ceil(Math.log(this.length)/Math.log(2));
            final int size = (1 << (height + 1)) - 1;
            this.data = new long[size];
            this.lazy = new long[size];
            build(A, 0, this.length - 1, 0);
        }
        
        private long build(final int[] A, final int min, final int max, final int i){
            if (min == max){
                return data[i] = A[min];
            }
            final int mid = getMid(min, max);
            return data[i] = build(A, min, mid, getLeft(i)) + 
                            build(A, mid+1, max, getRight(i));
        }
        
        public long get(int ql, int qr){
            return get(0, this.length - 1, ql, qr, 0);
        }
        
        private long get(final int min, final int max, final int ql, final int qr, final int i){
            if (max < ql || min > qr){
                return 0L;
            }
            final int left = getLeft(i);
            final int right = getRight(i);
            if(lazy[i] > 0){
                data[i] += lazy[i]*(max - min + 1);
                if (min < max){
                    lazy[left] += lazy[i];
                    lazy[right] += lazy[i];
                }
                lazy[i] = 0;
            }
            if (min >= ql && max <= qr){
                return data[i];
            }
            final int mid = getMid(min, max);
            return get(min, mid, ql, qr, left) + get(mid+1, max, ql, qr, right);
        }
        
        public void update(final int ql, final int qr, final int v){
            update(0, this.length - 1, ql, qr, 0, v);
        }
        
        private long update(final int min, final int max, final int ql, final int qr, final int i, final int v){
            final int left = getLeft(i);
            final int right = getRight(i);
            if(lazy[i] > 0){
                data[i] += lazy[i]*(max - min + 1);
                if (min < max){
                    lazy[left] += lazy[i];
                    lazy[right] += lazy[i];
                }
                lazy[i] = 0;
            }
            if (max < ql || min > qr){
                return data[i];
            }
            if (min >= ql && max <= qr){
                data[i] += ((long)v)*(max - min + 1);
                if (min < max){
                    lazy[left] += v;
                    lazy[right] += v;
                }
                return data[i];
            }
            final int mid = getMid(min, max);
            return data[i] = update(min, mid, ql, qr, left, v) + update(mid+1, max, ql, qr, right, v);
        }
        
        private static int getMid(final int a, final int b){
            return a + ((b - a) >> 1);
        }
        
        private static int getLeft(final int i){
            return 1 + (i << 1);
        }
        
        private static int getRight(final int i){
            return (1 + i) << 1;
        }
    }
    
    
    public static class RPQ{
        private final int mod;
        private final int length;
        private final long[] base;
        private final long[] data;
        private final long[] power;
        
        public RPQ(final int[] B, final int[] P, int mod){
            this.mod = mod;
            this.length = B.length;
            final int height = (int)Math.ceil(Math.log(this.length)/Math.log(2));
            final int size = (1 << (height + 1)) - 1;
            this.base = new long[size];
            this.data = new long[size];
            this.power = new long[size];
            buildBase(B, 0, this.length - 1, 0);
            buildData(B, P, 0, this.length - 1, 0);
        }
        
        private long buildData(final int[] B, final int[] P, final int min, final int max, final int i){
            if (min == max){
                return data[i] = pow(B[min], P[min], mod);
            }
            final int mid = getMid(min, max);
            return data[i] = (buildData(B, P, min, mid, getLeft(i)) * buildData(B, P, mid+1, max, getRight(i))) % mod;
        }
        
        private long buildBase(final int[] A, final int min, final int max, final int i){
            if (min == max){
                return base[i] = A[min];
            }
            final int mid = getMid(min, max);
            return base[i] = (buildBase(A, min, mid, getLeft(i)) * buildBase(A, mid+1, max, getRight(i))) % mod;
        }
        
        public long get(int ql, int qr){
            return get(0, this.length - 1, ql, qr, 0);
        }
        
        private long get(final int min, final int max, final int ql, final int qr, final int i){
            if (max < ql || min > qr){
                return 1;
            }
            final int left = getLeft(i);
            final int right = getRight(i);
            if(power[i] > 0){
                data[i] = (data[i] * pow(base[i], power[i], mod)) % mod;
                if (min < max){
                    power[left] += power[i];
                    power[right] += power[i];
                }
                power[i] = 0;
            }
            if (min >= ql && max <= qr){
                return data[i];
            }
            final int mid = getMid(min, max);
            return (get(min, mid, ql, qr, left) * get(mid+1, max, ql, qr, right)) % mod;
        }
        
        public void update(final int ql, final int qr, final int v){
            update(0, this.length - 1, ql, qr, 0, v);
        }
        
        private long update(final int min, final int max, final int ql, final int qr, final int i, final int v){
            final int left = getLeft(i);
            final int right = getRight(i);
            if(power[i] > 0){
                data[i] = (data[i] * pow(base[i], power[i], mod)) % mod;
                if (min < max){
                    power[left] += power[i];
                    power[right] += power[i];
                }
                power[i] = 0;
            }
            if (max < ql || min > qr){
                return data[i];
            }
            if (min >= ql && max <= qr){
                data[i] = (data[i] * pow(base[i], v, mod)) % mod;
                if (min < max){
                    power[left] += v;
                    power[right] += v;
                }
                return data[i];
            }
            final int mid = getMid(min, max);
            return data[i] = (update(min, mid, ql, qr, left, v) * update(mid+1, max, ql, qr, right, v)) % mod;
        }
        
        private static int getMid(final int a, final int b){
            return a + ((b - a) >> 1);
        }
        
        private static int getLeft(final int i){
            return 1 + (i << 1);
        }
        
        private static int getRight(final int i){
            return (1 + i) << 1;
        }
    }
}
