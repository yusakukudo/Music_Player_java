module MP3_Player {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens application to javafx.graphics, javafx.fxml;
}
