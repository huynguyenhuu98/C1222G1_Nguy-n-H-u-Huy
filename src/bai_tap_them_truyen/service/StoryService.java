package bai_tap_them_truyen.service;

import bai_tap_them_truyen.model.Story;
import bai_tap_them_truyen.repository.IStoryRepository;
import bai_tap_them_truyen.repository.StoryRepository;

import java.util.List;

public class StoryService implements IStoryService {
    IStoryRepository iStoryRepository = new StoryRepository();

    public List<Story> display() {
        List<Story> list = iStoryRepository.display();
        for (Story story : list) {
            System.out.println(story);
        }
        return list;
    }
}
