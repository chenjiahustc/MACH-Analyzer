package KTAustin.FileService.Service;

import KTAustin.FileDefinitions.FileParameter;
import KTAustin.HttpServerDefinitions.FileService.SaveDataFileReply;

import java.util.Date;
import java.util.List;

public interface IFileServiceEngine {
    SaveDataFileReply SaveFileByCategory(String category, String fileName,
                                         Date serverCreateTime, List<FileParameter> fileParams, byte[] fileContent);
}
