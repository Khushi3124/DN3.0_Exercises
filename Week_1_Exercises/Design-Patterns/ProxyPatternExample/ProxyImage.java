public class ProxyImage implements Image{
    private RealImage image;

    @Override
    public String display() {
      if(this.image == null){
        this.image = new RealImage();
        return image.display();
      }
      return "Image Loaded from Cache";
    }
}
