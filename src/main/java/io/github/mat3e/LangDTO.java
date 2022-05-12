package io.github.mat3e;

import io.github.mat3e.lang.Lang;

class LangDTO {
    private int id;
    private String code;

    LangDTO() {
        this(new Lang());
    }
    LangDTO(Lang lang) {
        this.id = lang.getId();
        this.code = lang.getCode();
    }
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setCode(String code){
        this.code=code;
    }
}
