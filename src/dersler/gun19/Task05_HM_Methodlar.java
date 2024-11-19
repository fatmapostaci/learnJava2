package dersler.gun19;

public class Task05_HM_Methodlar {

    /**
     *
     * @param s
     * @return
     */
    public boolean islemKabulEdildi(String s){
        String operator = operatoru_bul(s);
        if ( operator.equals("+") ||
                operator.equals("*") ||
                operator.equals("/") ||
                operator.equals("-") )
            return true;
        else return false;
    }
    public String operatoru_bul(String s){
        String o = s.replaceAll("\\w","");
        return o;
    }
    public double[] sayiları_bul(String s){
        String [] arr = s.split("[+*/-]");
        double[] arrDouble={0,0};
        arrDouble[0] = Double.parseDouble(arr[0].trim());
        arrDouble[1] = Double.parseDouble(arr[1].trim());
        return arrDouble;
    }
    public double toplama_yap(double[] arr){
        return (arr[0]+arr[1]);
    }
    public double cikarma_yap(double[] arr){
        return (arr[0]-arr[1]);
    }
    public double carpma_yap(double[] arr){
        return arr[0]*arr[1];
    }
    public double bolme_yap(double[] arr){
        if(arr[0]==0 || arr[1]==0)
            return 0.0;
        else if (arr[0]>=arr[1])
            return arr[0]/arr[1];
        else
            return arr[1]/arr[0];
    }
    public double hata(){
        return 0;
    }
}
