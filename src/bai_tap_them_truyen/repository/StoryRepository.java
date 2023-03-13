package bai_tap_them_truyen.repository;

import bai_tap_them_truyen.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryRepository implements IStoryRepository {
    private static final List<Story> productList = new ArrayList<>();
    static {
        productList.add(new Story(1001,"Tiếng anh", "1999","English"));
        productList.add(new Story(1002,"Tiếng nhật", "1998","Japanese"));
        productList.add(new Story(1003,"Tiếng đức", "1997","Germany"));
    }

    @Override
    public List<Story> display() {
        return productList;
    }
}
