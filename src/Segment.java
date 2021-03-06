import java.util.ArrayList;
import java.util.List;

public class Segment {
    private String segmentName;
    private int segmentNum;
    private int segmentSize;
    List<Page> pages;

    public Segment(String segmentName, int segmentSize) {
        this.segmentName = segmentName;
        this.segmentSize = segmentSize;
        pages = new ArrayList<>();
    }

    public int getSegmentSize() {
        return segmentSize;
    }

    public void setSegmentSize(int segmentSize) {
        this.segmentSize = segmentSize;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public int getSegmentNum() {
        return segmentNum;
    }

    public void setSegmentNum(int segmentNum) {
        this.segmentNum = segmentNum;
    }
}
