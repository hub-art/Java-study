package java0915;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 创建教师和课程的Map集合
        Map<String, String> teacherCourseMap = new HashMap<>();
        teacherCourseMap.put("张三", "数学");
        teacherCourseMap.put("李四", "数学");
        teacherCourseMap.put("王五", "英语");
        teacherCourseMap.put("赵六", "物理");
        teacherCourseMap.put("孙七", "物理");

        // 转换为以课程为key的集合
        Map<String, Set<String>> courseTeacherMap = teacherCourseMap.entrySet().stream()
                .collect(
                        // 使用groupingBy将教师和课程的键值对按照课程分组
                        // 使用mapping将教师转换为Set集合中的一个元素
                        // 使用toSet将多个教师组成的流转换为Set集合
                        // 最终得到以课程为key，以教师Set集合为value的Map集合
                        Collectors.groupingBy(Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey, Collectors.toSet())));

        // 输出转换后的集合
        System.out.println(courseTeacherMap);
    }
}
