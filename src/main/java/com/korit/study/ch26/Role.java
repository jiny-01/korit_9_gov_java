package com.korit.study.ch26;

public enum Role {

    ADMIN("ROLE_ADMIN", "관리자"),
    USER("ROLE_USER", "사용자"),
    MANAGER("ROLE_MANAGER", "매니저");
    //enum -> 정의는 클래스랑 같음(생성자, getter/setter)
    //but 선택할 수 있는 옵션이 있는지 여부의 차이

    private final String roleName;
    private final String roleNameKor;

    Role(String roleName, String roleNameKor) {
        this.roleName = roleName;
        this.roleNameKor = roleNameKor;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleNameKor() {
        return roleNameKor;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", roleNameKor='" + roleNameKor + '\'' +
                '}';
    }
}
