package com.example;

public class HelpDeskTicket {
    private String userName;
    private String equipmentCode;
    private String category;
    private String activity;

    public HelpDeskTicket(String userName, String equipmentCode, String category, String activity) {
        this.userName = userName;
        this.equipmentCode = equipmentCode;
        this.category = category;
        this.activity = activity;
    }

    public String getUserName() {
        return userName;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public String getCategory() {
        return category;
    }

    public String getActivity() {
        return activity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    @Override
    public String toString() {
        return "Usuário: " + userName +
                ", Equipamento: " + equipmentCode +
                ", Categoria: " + category +
                ", Atividade: " + activity;
    }

}
