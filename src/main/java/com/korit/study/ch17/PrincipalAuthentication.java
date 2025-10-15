package com.korit.study.ch17;

public class PrincipalAuthentication extends AbstractAuthentication{

    //Allargu 있어야 user 받아온 걸 넘겨줄 수 있음
    //안 받아올 거면 부모인 AbstractAuthentication 에 Noargu
    public PrincipalAuthentication(User user) {
        super(user);
    }

    public boolean containsAuthority(String role) {
        for (GrantedAuthority authority : getAuthorities()) {
            if (authority.getAuthority().equalsIgnoreCase(role)) {
                return true;
            }

            if (authority.getAuthority().replaceAll("ROLE_", "").equalsIgnoreCase(role)) {
                return true;
            }
            //원래 equals : 대소문자 구별함
            //equalsIgnoreCase : 대소문자 구별 안함
        }
        return false;
    }

    @Override
    public void checkAuthority() {
        System.out.print("권한: [");
        for (GrantedAuthority authority : getAuthorities()) {
            System.out.print(authority.getAuthority() + " ");
        }
        System.out.println("]");
    }

    @Override
    public String getUsername() {
        return super.getUser().getUsername();
    }

    @Override
    public String getPassword() {
        return super.getUser().getPassword();
    }

    @Override
    public GrantedAuthority[] getAuthorities() {
        // getRoles 로 가져온 roles 를 담을 새 배열 - 옮기는 것이므로 기존과 개수 동일
    GrantedAuthority[] authorities = new GrantedAuthority[super.getUser().getRoles().length];
        for (int i = 0; i < super.getUser().getRoles().length; i++) {
            authorities[i] = new SimpleGrantedAuthority(super.getUser().getRoles()[i]);
            //0 : role_user  1: role_admin
        }
        return authorities;
    }
}
