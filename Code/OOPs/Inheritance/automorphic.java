public class automorphic {
        public boolean isAutomorphic(int n) {
            long square = (long) n * n;
            String str = String.valueOf(n);
            String stSquare = String.valueOf(square);
            return stSquare.endsWith(str);
        }
        public static void main(String[] args) {
            automorphic automorphic = new automorphic();
            for(int n=0;n<1000;n++){
            if(automorphic.isAutomorphic(n)==true){
                System.out.println(n +" it is automorphic number");
            }
        }
    }
}

