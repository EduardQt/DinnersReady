package se.hkr.dinnersready.core;

import java.util.List;

import se.hkr.dinnersready.api.rest.responses.HouseholdFileResponse;

public class FileComponent {

    private List<HouseholdFileResponse> files;

    public List<HouseholdFileResponse> getFiles() {
        return files;
    }

    public void setFiles(List<HouseholdFileResponse> files) {
        this.files = files;
    }

    private static final FileComponent instance = new FileComponent();

    public static FileComponent getInstance() {
        return instance;
    }
}
