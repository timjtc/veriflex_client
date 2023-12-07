// package com.uecpe.veriflex_client.actions;

// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.io.File;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.concurrent.Executor;
// import java.util.concurrent.Executors;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// import javax.imageio.ImageIO;
// import javax.swing.AbstractAction;
// import javax.swing.JButton;
// import javax.swing.JFrame;

// import com.github.sarxos.webcam.Webcam;
// import com.github.sarxos.webcam.WebcamPanel;
// import com.github.sarxos.webcam.WebcamPicker;
// import com.github.sarxos.webcam.WebcamResolution;

// public class MainActions {

// 	public class CaptureImage extends AbstractAction {

// 		public CaptureImage() {
// 			super("Snapshot");
// 		}

// 		@Override
// 		public void actionPerformed(ActionEvent e) {
// 			try {
// 				for (int i = 0; i < webcams.size(); i++) {
// 					Webcam webcam = webcams.get(i);
// 					LocalDateTime datetime_now = LocalDateTime.now();
// 					DateTimeFormatter datetime_format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss");
// 					File file = new File(String.format("test-%s.jpg", datetime_now.format(datetime_format)));
// 					ImageIO.write(webcam.getImage(), "JPG", file);
// 					System.out.format("Image for %s saved in %s \n", webcam.getName(), file);
// 				}
// 			} catch (IOException e1) {
// 				e1.printStackTrace();
// 			}
// 		}

// 		private class InitCamera extends AbstractAction implements Runnable {

// 			public InitCamera() {
// 				super("Start");
// 			}
	
// 			@Override
// 			public void actionPerformed(ActionEvent e) {
	
// 				btStart.setEnabled(false);
// 				btSnapMe.setEnabled(true);
	
// 				// remember to start panel asynchronously - otherwise GUI will be
// 				// blocked while OS is opening webcam HW (will have to wait for
// 				// webcam to be ready) and this causes GUI to hang, stop responding
// 				// and repainting
	
// 				executor.execute(this);
// 			}
	
// 			@Override
// 			public void run() {
	
// 				btStop.setEnabled(true);
	
// 				for (WebcamPanel panel : panels) {
// 					panel.start();
// 				}
// 			}
// 		}
	
// 		private class CloseCamera extends AbstractAction {
	
// 			public CloseCamera() {
// 				super("Stop");
// 			}
	
// 			@Override
// 			public void actionPerformed(ActionEvent e) {
	
// 				btStart.setEnabled(true);
// 				btSnapMe.setEnabled(false);
// 				btStop.setEnabled(false);
	
// 				for (WebcamPanel panel : panels) {
// 					panel.stop();
// 				}
// 			}
// 		}
// 	}
	
// }
