package com.ak98neon.TaskOne;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class YamlArray {
    public int[] generate() {
        return new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5};
    }

    public int find(int[] arr) {
        int index = 0;
        int element = arr[index];

        while (true) {
            boolean isFind = false;

            for (int i = 0; i < arr.length; i++) {
                if (index != i && element == arr[i]) {
                    isFind = true;
                    break;
                }
            }

            if (isFind) {
                element = arr[++index];
            } else {
                break;
            }
        }

        return element;
    }

    public void saveFile(int[] arr, String file) throws IOException {
        Yaml yaml = new Yaml();
        FileWriter writer = new FileWriter(file);
        yaml.dump(arr, writer);
        writer.close();
    }

    public int[] readFile(String file) throws IOException {
        List<Integer> list;
        Yaml yaml = new Yaml();
        FileReader reader = new FileReader(file);
        list = yaml.load(reader);
        reader.close();
        return toIntArray(list);
    }

    private int[] toIntArray(List<Integer> integerList) {
        int[] result = new int[integerList.size()];
        int i = 0;
        for (Integer integer : integerList) {
            result[i++] = integer;
        }
        return result;
    }
}
