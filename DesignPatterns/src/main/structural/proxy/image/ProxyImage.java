package main.structural.proxy.image;

/**
 * The ProxyImage is used to create the HighRes. object but only when it is
 * required, because this proess is costly.
 * 
 * @author Sophie
 *
 */
public class ProxyImage implements Image {

	private String path;
	private Image realImage;

	public ProxyImage(String path) {
		this.path = path;
	}

	@Override
	public void showImage() {
		realImage = new HighResolutionImage(path);
		realImage.showImage();
	}

}
