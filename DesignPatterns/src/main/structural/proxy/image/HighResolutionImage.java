package main.structural.proxy.image;

public class HighResolutionImage implements Image {
	
	public HighResolutionImage(String path) {
		loadImage(path);
	}

	private void loadImage(String path) {
		//load
	}

	@Override
	public void showImage() {
		//show image
	}

}
