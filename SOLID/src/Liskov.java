import java.io.File;

public class Liskov {
    public interface CloudStorage {
        void upload(File file);
        File download(String fileId);
    }

    public interface DeletableStorage extends CloudStorage {
        void delete(String fileId);
    }

//    public class S3Storage implements CloudStorage {
//        private final S3Client s3Client;
//
//        @Override
//        public void upload(File file) {
//            s3Client.putObject(PutObjectRequest.builder()
//                    .bucket(bucketName)
//                    .key(file.getName())
//                    .build(), RequestBody.fromFile(file));
//        }
//
//        @Override
//        public File download(String fileId) {
//            ResponseBytes<GetObjectResponse> objectBytes =
//                    s3Client.getObjectAsBytes(GetObjectRequest.builder()
//                            .bucket(bucketName)
//                            .key(fileId)
//                            .build());
//            return createFileFromBytes(objectBytes);
//        }
//    }

//    public class AzureBlobStorage implements DeletableStorage {
//        private final BlobServiceClient blobClient;
//
//        @Override
//        public void upload(File file) {
//            blobClient.getBlobContainerClient(containerName)
//                    .getBlobClient(file.getName())
//                    .uploadFromFile(file.getPath());
//        }
//
//        @Override
//        public File download(String fileId) {
//            // Download logic
//        }
//
//        @Override
//        public void delete(String fileId) {
//            blobClient.getBlobContainerClient(containerName)
//                    .getBlobClient(fileId)
//                    .delete();
//        }
//    }
}
