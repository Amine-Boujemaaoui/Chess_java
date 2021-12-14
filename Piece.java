/**
 * Piece
 */
public class Piece{

    private King k;  
    private Queen q;
    private Bishop[] b;
    private Knight[] c;
    private Rock[] r;
    private Pawn[] p;
    private String color;
    private Gameur gameur;

    public Piece(String c,Gameur g){
        this.gameur = g;
        this.color = c;
        this.k = new King();
        this.q = new Queen();
        this.b = new Bishop[2];
        this.c = new Knight[2];
        this.r = new Rock[2];
        this.p = new Pawn[8];
    }


    //getters

    public String getColor(){
        return this.color;
    }
    // public int getPosition(){
    //     return this.position;
    // }

    //setteurs

    // public void setColor(String c){
    //     this.color = c;
    // }
    // public void setPosition(int p){
    //     this.position = p;
    // }

    //init

    public void init(){
        if(this.getColor().equals("blanc")){
            this.k.setColor("blanc");
            this.k.setPosition(29);
            this.q.setColor("blanc");
            this.q.setPosition(28);
            int i = 0;
            int x,y,z;
            x = 25;
            y = 26;
            z = 27;            
            while (i < 2){
                this.r[i].setColor("blanc");
                this.r[i].setPosition(x);
                this.c[i].setColor("blanc");
                this.c[i].setPosition(y);
                this.b[i].setColor("blanc");
                this.b[i].setPosition(z);
                x+=7;
                y+=5;
                z+=3;
                i++;
            }
            int j,w;
            j = 0;
            w = 17;
            while (j < 8){
                this.p[j].setColor("blanc");
                this.p[j].setPosition(w);
                w++;
                j++;
            }
        }else if(this.getColor().equals("noir")){
                this.k.setColor("noir");
            this.k.setPosition(5);
            this.q.setColor("noir");
            this.q.setPosition(4);
            int i = 0;
            int x,y,z;
            x = 1;
            y = 2;
            z = 3;            
            while (i < 2){
                this.r[i].setColor("noir");
                this.r[i].setPosition(x);
                this.c[i].setColor("noir");
                this.c[i].setPosition(y);
                this.b[i].setColor("noir");
                this.b[i].setPosition(z);
                x+=7;
                y+=5;
                z+=3;
                i++;
            }
            int j,w;
            j = 0;
            w = 9;
            while (j < 8){
                this.p[j].setColor("noir");
                this.p[j].setPosition(w);
                w++;
                j++;
            }
        }else{
            System.out.println("Vous n'avez pas choisit une bonne couleur.\nVeillez choisir entre soit blanc soit noir.");
            this.init();
        }
    }
}