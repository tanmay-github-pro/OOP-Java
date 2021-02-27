import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
    String title, author, edition;

    Book(String t, String a, String e){
        title=t;
        author=a;
        edition=e;
    }

    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(edition);
    }
}

class L5_R6 {
    public static void main(String[] args) {
        Book[] arr = new Book[6];
        arr[0] = new Book("1-Harry Book", "Harry", "12");
        arr[1] = new Book("1-Mary Book", "Mary", "13");
        arr[2] = new Book("2-Harry Book", "Harry", "12");
        arr[3] = new Book("2-Mary Book", "Mary", "13");
        arr[4] = new Book("3-harry Book", "Harry", "12");
        arr[5] = new Book("3-Mary Book", "Mary", "13");
        
        Book[] arr1;
        
        try{
            FileOutputStream fos = new FileOutputStream("t.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arr);
            oos.close();
            fos.close();
            
            FileInputStream fis = new FileInputStream("t.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arr1 = (Book[]) ois.readObject();
            ois.close();
            fis.close();
            
            int n = 6;
            for(int i=0;i<n;i++){;
                if(arr1[i].author==arr1[0].author){
                    System.out.println(arr1[i].title);
                }
            }
        }
        catch(Exception e){System.out.println(e);}  
    }
}