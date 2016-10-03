import de.looksgood.ani.*;
PFont f;
PImage img1;
PImage img2;
PImage img3;
float x = 360;
float y = 425;
float z = 360;
float u = 425;

void setup() {
  size(630, 900);
  //smooth();
  img1 = loadImage("/Users/damla/OneDrive/Documents/Poster/godwardr.jpg");
  img2 = loadImage("C:/Users/damla/OneDrive/Documents/Poster/godwardc.jpg");
  img3 = loadImage("C:/Users/damla/OneDrive/Documents/Poster/godwardg.jpg");
  img2.resize(660,900);
  img3.resize(660,900);
  img1.resize(660,900);
  //printArray(PFont.list());
  f = createFont("Vampirr", 120);
  Ani.init(this);
  
  //noLoop();

  
}

void draw() {
  background(0);
  imageMode(CENTER);
  image(img1, 315, 425);
  blendMode(LIGHTEST);
  imageMode(CENTER);
  image(img2, x + 330, y);
  blendMode(LIGHTEST);
  imageMode(CENTER);
  image(img3, z + 330, y);
  
  
  textFont(f);
    
  
  textAlign(CENTER);
  drawType(width * 0.5);
 
}
void mouseMoved() {
    // animate the variables x and y in 1.5 sec to mouse click position
    Ani.to(this, 1.5, "x", -mouseX/15);
    Ani.to(this, 1.5, "z", -mouseX/30);
    //Ani.to(this, 1.5, "y", mouseY);
}

void drawType(float x) {
  fill(255);
  text("John", x, 400);
  //fill(51);
  text("William", x, 460);
  //fill(204);
  text("Godward", x, 520);
  //fill(255);
  //text("shi", x, 710);
}