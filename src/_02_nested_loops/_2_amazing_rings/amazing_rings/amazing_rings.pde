int x= 250;
int speed=1;
int x2= 750;
void setup() {
    size(1000,1000);
noFill();

}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  
  
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */

  background(#FFFFFF);
for(int i=25; i>0; i--){

 
ellipse(x,500,i*10,i*10); 
}


x+=speed;

if(x>=width){

  speed=-speed;

}

if(x<=0){

  speed=-speed;

}
for(int i=25; i>0; i--){



ellipse(x2,500,i*10,i*10); 
}
x2-=speed;

}
