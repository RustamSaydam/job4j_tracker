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
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
                }
            };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator<Attachment> nameComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(right.getSize(), left.getSize());
               }
            };
        attachments.sort(comparator);
        System.out.println(attachments);
    }
}
