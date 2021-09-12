/**
 * A filter that applies the colour blue to an image
 */
public class BlueFilter extends Filter {
	public BlueFilter(String name)
    {
        super(name);
	}

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
            	 int p = image.getRGB(x,y);
                 int b = (p>>16)&0xff;
                 image.setRGB(x,y,b);
            }
        }
    }
}


