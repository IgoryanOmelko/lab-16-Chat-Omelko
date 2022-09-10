package com.example.lab16_chatomelko;

public class DataExchangePackage {
    private String receiverIPaddress;
    private String receiverPort;
    private String receiverNickName;
    private String senderNickName;
    private String senderMessage;
    private String senderIpPort;
    private String senderIPaddress;
    private String senderPort;
    private int receivePackageLength = 6;

    public void SetIPaddress(String IP) {
        receiverIPaddress = IP;
    }

    public void SetPort(String port) {
        receiverPort = port;
    }

    public void SetNickName(String nickName) {
        receiverNickName = nickName;
    }

    public void SetSenderNickName(String nickName) {
        senderNickName = nickName;
    }

    public void SetSenderMessage(String message) {
        senderMessage = message;
    }

    public void SetIpPort(String IpPort) {
        senderIpPort = IpPort;
    }

    public void SetSenderIPaddress(String IP) {
        senderIPaddress = IP;
    }

    public void SetSenderPort(String port) {
        senderPort = port;
    }

    public String GetIPaddress() {
        return receiverIPaddress;
    }

    public String GetPort() {
        return receiverPort;
    }

    public String GetNickName() {
        return receiverNickName;
    }

    public String GetSenderNickName() {
        return senderNickName;
    }

    public String GetSenderMessage() {
        return senderMessage;
    }

    public String GetIpPort() {
        return senderIpPort;
    }

    public String GetSenderIPaddress() {
        return senderIPaddress;
    }

    public String GetSenderPort() {
        return senderPort;
    }

    public int GetReceivePackageLength() {
        return receivePackageLength;
    }
}
