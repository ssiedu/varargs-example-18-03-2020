public class Television extends Radio {
    
    public void showVideo(){
        System.out.println("Showing The Video...........");
    }
    
    public static void main(String args[]){
        Television tv=new Television();
        tv.playAudio();
        tv.showVideo();
    }
}
