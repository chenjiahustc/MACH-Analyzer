package KTAustin.FileService.Controllers;

import KTAustin.HttpServerDefinitions.FileService.*;
import KTAustin.HttpServerDefinitions.JobCommandReply;
import KTAustin.HttpServerDefinitions.ServerTimeReply;
import KTAustin.HttpServerDefinitions.SoftwareVersionReply;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class FileServiceController {

    @GetMapping("5DA/SoftwareVersion")
    public SoftwareVersionReply SoftwareVersion(){
        throw new UnsupportedOperationException();
    }

    @GetMapping("5DA/CategoryByLotInfo")
    public FileCategoryReply GetCategoryByLotInfo(){
        throw new UnsupportedOperationException();
    }

    @PostMapping("5DA/FileByLotInfo")
    public SaveDataFileReply SaveFileByLotInfo(@RequestBody SaveFileByLotInfoRequest request){
        throw new UnsupportedOperationException();
    }

    @PostMapping("5DA/FileByCategory")
    public SaveDataFileReply SaveFileByCategory(@RequestBody SaveFileByCategoryRequest request){
        throw new UnsupportedOperationException();
    }

    @GetMapping("5DA/DataFile")
    public FileDownloadReply GetDataFile(){
        throw new UnsupportedOperationException();
    }

    @DeleteMapping("5DA/DataFile")
    public JobCommandReply DeleteDataFile(@RequestBody DeleteDataFileRequest request){
        throw new UnsupportedOperationException();
    }

    @DeleteMapping("5DA/BatchedDataFiles")
    public JobCommandReply DeleteBatchedDataFiles(@RequestBody DeleteBatchedDataFilesRequest request){
        throw new UnsupportedOperationException();
    }

    @GetMapping("5DA/ServerTime")
    public ServerTimeReply ServerTime(){
        ServerTimeReply serverTimeReply = new ServerTimeReply();
        serverTimeReply.setServerTime(new Date());
        return serverTimeReply;
    }

    @GetMapping("5DA/FileStoragePath")
    public FileStoragePathReply GetFileStoragePath(){
        throw new UnsupportedOperationException();
    }

    @GetMapping("5DA/ProductionBaseStoragePath")
    public FileStoragePathReply GetProductionBaseStoragePath(){
        throw new UnsupportedOperationException();
    }

    //need to support < 3.0.1
}
