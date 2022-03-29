import java.util.Scanner;
public class tree{
    static Scanner in=new Scanner(System.in);
    public void insert(node a, int b){
        if(b<a.value){
            if(a.left!=null) insert(a.left,b);
            else{
                a.left=new node();
                a.left.input(b);
                System.out.println(b+" di kiri  "+a.value);
            }
        }
        else if(b>a.value){
            if(a.right!=null) insert(a.right,b);
            else{
                a.right=new node();
                a.right.input(b);
                System.out.println(b+" di kanan "+a.value);
            }
        }
    }
    public void view(node a){
        System.out.print("Pre Order  : ");
        preOrder(a);
        System.out.println(" ");
    }  
public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value+" ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
}
 
class node{
    node left,right;
    int value;
    public void input(int a){
        value=a;
    }
    public static void main(String[] args){
        tree tr=new tree();
        node root=new node();
        int menu=1;
        int r=1;
        int a;
        while(menu!=3){
            System.out.println("\n===============================");
            System.out.println("         BINARY TREE");
            System.out.println("===============================");
            System.out.println(" ");    
            System.out.print("1.Masukkan ID Buku \n2.Tampilkan Hasil Pre Order\n3.Exit\n\n Pilih Nomor Berapa : ");
            menu=tr.in.nextInt();
            if(menu==1){
                System.out.print("ID Buku : ");
                a=tr.in.nextInt();
                if(r==1){
                    root.input(a);
                    r--;
                }
                else tr.insert(root,a);
            }
            else if(menu==2) tr.view(root);
            else if(menu==3) System.out.println("Terima Kasih");
            else System.out.println("Layanan Tidak Tersedia");
            System.out.println(" ");
        }
    }
}