import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import de.looksgood.ani.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Poster extends PApplet {


PFont f;
PImage img1;
PImage img2;
PImage img3;
float x = 360;
float y = 425;
float z = 360;
float u = 425;

public void setup() {
  
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

public void draw() {
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
  drawType(width * 0.5f);
 
}
public void mouseMoved() {
    // animate the variables x and y in 1.5 sec to mouse click position
    Ani.to(this, 1.5f, "x", -mouseX/15);
    Ani.to(this, 1.5f, "z", -mouseX/30);
    //Ani.to(this, 1.5, "y", mouseY);
}

public void drawType(float x) {
  fill(255);
  text("John", x, 400);
  //fill(51);
  text("William", x, 460);
  //fill(204);
  text("Godward", x, 520);
  //fill(255);
  //text("shi", x, 710);
}
  public void settings() {  size(630, 900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "Poster" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
