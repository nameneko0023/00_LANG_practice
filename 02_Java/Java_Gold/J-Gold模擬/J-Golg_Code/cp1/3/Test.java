public class Test {
    int instanceVal; //インスタンス変数
    static int staticVal; //static変数
    int methodA() {return instanceVal; } //OK
    int methodB() {return staticVal; } //OK

    //staticメソッド->インスタンス変数のためコンパイルエラー
    //static methodC() { return instanceVal; } //NG

    //staticメソッド->static変数のためOK
    static methodD() { return staticVal; } //OK

    //staticメソッド->自クラスをインスタンス化　インスタンス変数をobj.instanceとして呼び出しているOK
    //インスタンスメンバとstaticメンバが混在する場合アクセス方法注意
    static methodE() { 
        Test obj = new Test();
        return obj.instanceVal; }
}
