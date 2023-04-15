public class Post implements Comparable<Post>{
 
    // Class data members
    public String accountName;
    public String videoName;
    public int Likes;
    public String Tittle;

public Post(String accountName,String videoName,int Likes,String Tittle){
    this.accountName=accountName;
    this.videoName=videoName;
    this.Likes=Likes;
    this.Tittle=Tittle;
}

public String getAccountName(){
    return accountName;
}

public String getVideoName(){
    return videoName;
}

public int getLikes(){
    return Likes;
}

public String getTittle(){
    return Tittle;
}

@Override
    public int compareTo(Post o) {
        return this.accountName.compareTo(o.accountName);
    }
}