package OpenChallenge;

import java.util.Scanner;

public abstract class GameObject{

    protected int distance; // 한번 이동 거리
    protected int x, y; // 현재 위치
    public GameObject(int startX, int startY, int distance)
    {
        this.x=startX;
        this.y=startY;
        this.distance=distance;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p)
    { //이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x==p.getX()&&this.y==p.getY())
            return true;
        else
            return false;
    }
    // 이동한 후의 새로운 위치로 x,y 변경
    protected abstract void move();

    // 객체의 모양을 나타내는 문자 리턴
    protected abstract char getShape();



}

class Bear extends GameObject{

    char shape;

    Bear()
    {
        super(0,0,1);
        shape='B';
    }

    protected void move() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(F) >> ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if(c=='a'&&x-1>=0)
            x-=1;
        else if(c=='s'&&y+1<10)
            y+=1;
        else if(c=='d'&&y-1>=0)
            y-=1;
        else if(c=='f'&&x+1<20)
            x+=1;
    }

    protected char getShape()
    {
        return shape;
    }

}

class Fish extends GameObject{

    char shape;
    int cnt;
    int mcnt;
    Fish()
    {
        super(5,5,1);
        shape='@';
        cnt=0;
    }

    protected void move() {

        if(cnt==5)
        {
            cnt=0;
            mcnt=0;
        }

        if(mcnt<2)
        {
            int num = (int)(Math.random()*4);
            System.out.println(num);
            if(num==0&&x-1>=0)
                x-=1;
            else if(num==1&&y+1<10)
                y+=1;
            else if(num==2&&y-1>=0)
                y-=1;
            else if(num==3&&x+1<20)
                x+=1;
            mcnt++;
        }
        cnt++;

    }

    protected char getShape()
    {
        return shape;
    }

}

class Game{

    void show(GameObject B, GameObject F)
    {
        int bx=B.getX();
        int by=B.getY();
        int Fx=F.getX();
        int Fy=F.getY();
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<20;j++) {
                if(bx==j&&by==i)
                    System.out.print(B.getShape());
                else if(Fx==j&&Fy==i)
                    System.out.print(F.getShape());
                else
                    System.out.print("-");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Game game = new Game();
        Bear bear = new Bear();
        Fish fish = new Fish();

        while(true)
        {
            game.show(bear, fish);
            bear.move();
            fish.move();
            if(bear.collide(fish)) {
                System.out.println("Bear Wins!!");
                break;
            }
        }

    }

}