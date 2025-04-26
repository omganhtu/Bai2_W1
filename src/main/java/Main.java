import model.Album;
import service.AlbumService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlbumService service = new AlbumService();
        try {
            List<Album> albums = service.fetchAlbums();

            // In ra màn hình
            albums.forEach(System.out::println);

            // Ghi ra file
            service.saveAlbumsToFile(albums, "albums.json");

        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
