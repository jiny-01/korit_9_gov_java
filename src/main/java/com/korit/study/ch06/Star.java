package com.korit.study.ch06;

public class Star {
    public static void main(String[] args) {
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); j++) {
//                System.out.print(" ");
//            }
            System.out.print(i == 0 || i == n - 1 ? "" : " ");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();


        int num = 11;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (i < (num / 2) ? (num / 2) - i : i - (num / 2)) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) + 1);
        }

        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println("*");
//            }
//            System.out.println(" ");
//        }

        //다이아몬드
//        int n = 5;
//        System.out.println("-----다이아몬드----");
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int num = 11;  //전체 반복횟수 - 라인 수
//        for (int i = 0; i < num; i++) {
//            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) + 1) ;
//            // num / 2 = 5.5 임(절반 = 5번째 줄)  절반값보다 작으면 증가 / 크면 역으로 감소
//        }
//        for (int i = 0; i < num; i++) {
//            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));  //공백의 개수 - 5번째 줄 : 공백 0개
//            // 절반보다 작을 땐 절반인 위치의 값 / 5번째 줄 공백 0개 기준으로 위론 증가 / 아래론 감소
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(10 - i);
//        }




//        System.out.println("----대각선 공백-----");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 2 ; j++) {    //총 1줄에 10개 시작 공백 2개
//                System.out.print("*");
//            }
//
////            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); j++) {
////                System.out.println();
////            }
//
//            System.out.println(i == 0 || i == n - 1 ? "": " ");
//
//            for (int j = 0; j < i - 1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



//            int size = 20; // 별 크기 (값을 크게 하면 별이 커짐)
//            int center = size;
//            int radius = size;
//
//            int canvasSize = size * 2 + 1;
//            char[][] canvas = new char[canvasSize][canvasSize];
//
//            // 캔버스 초기화
//            for (int i = 0; i < canvasSize; i++) {
//                for (int j = 0; j < canvasSize; j++) {
//                    canvas[i][j] = ' ';
//                }
//            }
//
//            // 꼭짓점 좌표 계산
//            int[][] points = new int[5][2];
//            for (int i = 0; i < 5; i++) {
//                double angle = Math.toRadians(-90 + i * 72); // -90도에서 시작 (위쪽)
//                int x = (int) Math.round(center + radius * Math.cos(angle));
//                int y = (int) Math.round(center + radius * Math.sin(angle));
//                points[i][0] = x;
//                points[i][1] = y;
//            }
//
//            // 별 그리기 순서
//            int[] order = {0, 2, 4, 1, 3, 0};
//
//            // 꼭짓점 연결
//            for (int i = 0; i < order.length - 1; i++) {
//                drawLine(canvas,
//                        points[order[i]][0], points[order[i]][1],
//                        points[order[i + 1]][0], points[order[i + 1]][1]);
//            }
//
//            // 출력
//            for (int i = 0; i < canvasSize; i++) {
//                for (int j = 0; j < canvasSize; j++) {
//                    System.out.print(canvas[i][j]);
//                }
//                System.out.println();
//            }
//        }
//
//        // 브레젠험 직선 알고리즘
//        private static void drawLine ( char[][] canvas, int x1, int y1, int x2, int y2){
//            int dx = Math.abs(x2 - x1);
//            int dy = Math.abs(y2 - y1);
//            int sx = (x1 < x2) ? 1 : -1;
//            int sy = (y1 < y2) ? 1 : -1;
//            int err = dx - dy;
//
//            while (true) {
//                if (y1 >= 0 && y1 < canvas.length && x1 >= 0 && x1 < canvas[0].length) {
//                    canvas[y1][x1] = '*';
//                }
//                if (x1 == x2 && y1 == y2) break;
//                int e2 = 2 * err;
//                if (e2 > -dy) {
//                    err -= dy;
//                    x1 += sx;
//                }
//                if (e2 < dx) {
//                    err += dx;
//                    y1 += sy;
//                }
//            }
//        }
        }

    }





