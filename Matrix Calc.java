import java.awt.event.*;
import java.awt.event.ItemListener;
import java.awt.*;
import java.applet.*;

public class calculatoooro extends Applet implements ActionListener
{
String msg="0";
Color purple = new Color(150,30,180);
TextField a1,a2,a3,b1,b2,b3,c1,c2,c3;
TextField d1,d2,d3,e1,e2,e3,f1,f2,f3;
TextField g1,g2,g3,h1,h2,h3,i1,i2,i3;
Label det,restext;
Button magic = new Button("MAGIC!");
Choice op = new Choice();
Checkbox deter = new Checkbox("Determinant");
Checkbox tran = new Checkbox("Transpose");
Font detFont = new Font("Arial",Font.BOLD,20);
Font resFont = new Font("Arial",Font.BOLD,16);
char t1,t2,t3,t4,t5,t6,t7,t8,t9;
double x1,x2,x3,x4,x5,x6,x7,x8,x9;
double y1,y2,y3,y4,y5,y6,y7,y8,y9;
int m1,m2,m3,m4,m5,m6,m7,m8,m9;
String n1,n2,n3,n4,n5,n6,n7,n8,n9;
double r1,r2,r3,r4,r5,r6,r7,r8,r9;
String z1,z2,z3,z4,z5,z6,z7,z8,z9;
String v1,v2,v3,v4,v5,v6,v7,v8,v9;
public void init()
{
setBackground(purple);
setLayout(null);

op.setBounds(300,20,150,80);
op.add("Addition");
op.add("Subtraction (A-B)");
op.add("Subtraction (B-A)");
op.add("Multiplication (A*B)");
op.add("Multiplication (B*A)");
op.add("Division (A/B)");
op.add("Division (B/A)");
op.add("Cofactor");
op.add("Inverse");
op.add("Trace");
add(op);

deter.setBounds(320,60,150,30);
add(deter);
tran.setBounds(320,100,150,30);
add(tran);



a1=new TextField("");
a1.setBounds(20,25,35,20);
add(a1);
a2=new TextField("");
a2.setBounds(100,25,35,20);
add(a2);
a3=new TextField("");
a3.setBounds(180,25,35,20);
add(a3);

b1=new TextField("");
b1.setBounds(20,60,35,20);
add(b1);
b2=new TextField("");
b2.setBounds(100,60,35,20);
add(b2);
b3=new TextField("");
b3.setBounds(180,60,35,20);
add(b3);

c1=new TextField("");
c1.setBounds(20,95,35,20);
add(c1);
c2=new TextField("");
c2.setBounds(100,95,35,20);
add(c2);
c3=new TextField("");
c3.setBounds(180,95,35,20);
add(c3);

d1=new TextField("");
d1.setBounds(20,200,35,20);
add(d1);
d2=new TextField("");
d2.setBounds(100,200,35,20);
add(d2);
d3=new TextField("");
d3.setBounds(180,200,35,20);
add(d3);

e1=new TextField("");
e1.setBounds(20,235,35,20);
add(e1);
e2=new TextField("");
e2.setBounds(100,235,35,20);
add(e2);
e3=new TextField("");
e3.setBounds(180,235,35,20);
add(e3);

f1=new TextField("");
f1.setBounds(20,270,35,20);
add(f1);
f2=new TextField("");
f2.setBounds(100,270,35,20);
add(f2);
f3=new TextField("");
f3.setBounds(180,270,35,20);
add(f3);

g1=new TextField("");
g1.setBounds(540,25,35,20);
add(g1);
g2=new TextField("");
g2.setBounds(620,25,35,20);
add(g2);
g3=new TextField("");
g3.setBounds(700,25,35,20);
add(g3);

h1=new TextField("");
h1.setBounds(540,60,35,20);
add(h1);
h2=new TextField("");
h2.setBounds(620,60,35,20);
add(h2);
h3=new TextField("");
h3.setBounds(700,60,35,20);
add(h3);

i1=new TextField("");
i1.setBounds(540,95,35,20);
add(i1);
i2=new TextField("");
i2.setBounds(620,95,35,20);
add(i2);
i3=new TextField("");
i3.setBounds(700,95,35,20);
add(i3);

restext = new Label("- - - - - - - RESULT - - - - - - -");
restext.setBounds(540,110,200,50);
restext.setFont(resFont);
add(restext);

det = new Label("Determinant: ");
det.setBounds(480,200,150,50);
det.setFont(detFont);
add(det);


magic.setBounds(320,180,80,40);
add(magic);
magic.addActionListener(this);







setLayout(null);

}

public void actionPerformed(ActionEvent e)
{
String z1 = a1.getText();
String z2 = a2.getText();
String z3 = a3.getText();
String z4 = b1.getText();
String z5 = b2.getText();
String z6 = b3.getText();
String z7 = c1.getText();
String z8 = c2.getText();
String z9 = c3.getText();
String v1 = d1.getText();
String v2 = d2.getText();
String v3 = d3.getText();
String v4 = e1.getText();
String v5 = e2.getText();
String v6 = e3.getText();
String v7 = f1.getText();
String v8 = f2.getText();
String v9 = f3.getText();
    
  double r1 = Integer.parseInt(z1) + Integer.parseInt(v1);
g1.setText(String.valueOf(r1));
  double r2 = Integer.parseInt(z2) + Integer.parseInt(v2);
g2.setText(String.valueOf(r2));
  double r3 = Integer.parseInt(z3) + Integer.parseInt(v3);
g3.setText(String.valueOf(r3));

  double r4 = Integer.parseInt(z4) + Integer.parseInt(v4);
h1.setText(String.valueOf(r4));
  double r5 = Integer.parseInt(z5) + Integer.parseInt(v5);
h2.setText(String.valueOf(r5));
  double r6 = Integer.parseInt(z6) + Integer.parseInt(v6);
h3.setText(String.valueOf(r6));

  double r7 = Integer.parseInt(z7) + Integer.parseInt(v7);
i1.setText(String.valueOf(r7));
  double r8 = Integer.parseInt(z8) + Integer.parseInt(v8);
i2.setText(String.valueOf(r8));
  double r9 = Integer.parseInt(z9) + Integer.parseInt(v9);
i3.setText(String.valueOf(r9));

}
}
