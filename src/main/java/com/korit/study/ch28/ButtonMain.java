package com.korit.study.ch28;
interface ClickListener {
    void onClick();
}

class Button {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

public class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();

        button.click();

//        // TODO: 여기에 익명 클래스를 사용하여 ClickListener 구현
//        button.setClickListener(new ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("버튼이 클릭되었습니다.");
//            }
//        });

        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다.");
            }
        };
        button.setClickListener(clickListener);



        button.click();
    }
}
