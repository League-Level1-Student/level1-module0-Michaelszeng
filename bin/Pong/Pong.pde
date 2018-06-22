import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x=500;
int y=500;
int xSpeed=23;
int ySpeed=16;
void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("pong2.wav", 128);
  size(1000, 800);
  background(50, 50, 50);
}
void draw() {
  background(50, 50, 50);
  fill(175, 0, 0);
  rect(mouseX, 750, 200, 16);
  fill(115, 100, 160);
  stroke(0, 0, 0);
  ellipse(x, y, 50, 50);
  x=x+xSpeed;
  y=y+ySpeed;
  if (x<25) {
    xSpeed=xSpeed*-1;
  } else if (x>975) {
    xSpeed=xSpeed*-1;
  }
  if (y<25) {
    ySpeed=ySpeed*-1;
  } else if (y>775) {
    ySpeed=ySpeed*-1;
  } 
  if (y==788) {
    sound.trigger();
  }
  if (y>741 && y<769 && x>mouseX && x<mouseX+200) {
    ySpeed=ySpeed*-1;
}
}