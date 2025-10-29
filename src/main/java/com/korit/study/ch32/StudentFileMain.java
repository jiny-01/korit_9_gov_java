package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class StudentFileMain {
    public static void main(String[] args) throws IOException {

        try {
            //파일 데이터 읽어오기
            FileReader fileReader = new FileReader("student.txt");
            StringBuilder builder = new StringBuilder();

            while (true) {
                int readData;
                readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                builder.append((char) readData);
            }


            String content = builder.toString();
            fileReader.close();

            //리스트로 변환?
            List<String> getInfo = Arrays.asList(builder.toString().split("\n"));   //리스트로 변환
            StringBuilder newContent = new StringBuilder();    //덮어쓰기할 내용


            //덮어쓰기
            for (String info : getInfo) {
                if (info.startsWith("이름:")) {            //이름: 부분 추출
//                    newContent.append(newInfo.name);
                    newContent.append("이름: 김지니\n");
                } else if (info.startsWith("나이:")) {     //나이: 추출
//                    newContent.append(newInfo.age);
                    newContent.append("나이: 25\n");
                } else {
                    newContent.append(info).append("\n");
                }
            }
            System.out.println("변경 완료: " + getInfo);


            FileWriter fileWriter = new FileWriter("student.txt");
            fileWriter.write(newContent.toString());
            fileWriter.close();

            System.out.println("수정완료: " + newContent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
///////////////////////////////////////////////////////////////////////////////////////

        //강사님 풀이
        final String FILE_NAME = "student.txt";


        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder2 = new StringBuilder();   //읽어온 문자열 stringbuilder 에 저장
            //무한 반복해서 데이터 읽어오기
            while (true) {
                int readData2 = fileReader.read();
                if (readData2 == -1) {   //텍스트의 마지막이면 멈추기
                    break;
                }
                builder2.append((char) readData2);  //빌더에 읽어온 데이터 한 글자 문자로 바꿔서 추가
            }
            fileReader.close();

            //내용 덮어쓰기 - FileWriter
            FileWriter fileWriter = new FileWriter(FILE_NAME);

            //이름, 나이 바꾸기
            Map<String, String> modifyDataMap = Map.of(
                    "이름", "김지니",
                    "나이", "25",
                    "학교", "부경대학교");


            //불변 리스트가 되므로 Arrays.asList 로 바꿔줌
            List<String> readLineList = new ArrayList<>();
            readLineList.addAll(Arrays.asList(builder2.toString().split("\n")));     //builder 줄바꿈해서 배열로

            //modifyData 에서 키, 밸류 가진 셋
            modifyDataMap.entrySet().forEach(entry -> {});

            //AtomicReference : String 인 문자열 한 줄을 담는 Atomic 객체??????
            readLineList.stream().map(line -> {                        //리스트에거 맵 돌려서 한 줄씩 가져옴
                AtomicReference<String> stringAtomicReference = new AtomicReference<>(line);  //list 를 아토믹으로 쓸수없어서 Atomic Reference 쓰면 아무 타입 가능
                modifyDataMap.entrySet().forEach(entry -> {        //맵을 entryset 으로 키, 밸류 갖는 셋 자료형 만들기
                    if (stringAtomicReference.get().contains(entry.getKey())) {      //아토믹.get 한 게 getKey - 이름, 나이 가지고 있는디                          //
                    stringAtomicReference.set(String.format("%s : %s\n", entry.getKey(), entry.getValue())
                    );//포함하고 있으면 set 으로 포맷팅한 문자열
                    }
                });
                return stringAtomicReference.get();
            }).toList()
                    .forEach(line -> {
                        try {
                            fileWriter.write(line + "\n");

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            fileWriter.close();
            System.out.println("내용 수정 완료");

//            modifyData.entrySet().forEach(entry -> {
//                readLineList.stream()
//                        //map 에 line(텍스트의 한 줄 요소)
//                        .map(line -> {
//                            if (line.contains(entry.getKey())) {
//                                return String.format("%s : %s\n", entry.getKey(), entry.getValue());
//                            }
//                        }).toList();
//
//            });



        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾았어요");
        } catch (IOException e) {
            System.out.println("파일 내부의 내용을 읽지 못했습니다.");
        }






    }
}
