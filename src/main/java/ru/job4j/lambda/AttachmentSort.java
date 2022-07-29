package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("Image 1", 100),
                new Attachment("Image 1", 34),
                new Attachment("Image 1", 13)
        );
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator nameComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment right = (Attachment) o2;
                Attachment left = (Attachment) o1;
                return Integer.compare(right.getSize(), left.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
    }
}
