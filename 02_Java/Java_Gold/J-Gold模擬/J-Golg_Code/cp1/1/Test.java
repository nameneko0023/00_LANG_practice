//final修飾子
//class サブクラス作成不可
//メソッド　サブクラス側でのオーバーライド不可
//変数　定数として扱う

class SuperA{}
final class SuperB{}
class SuperC{ void print() }
class SuperD{ final void print() }

//サブクラス作成
class SubA extends SuperA {} //OK
class SubB extends SuperB {} //NG

//オーバーライド
class SubC extends SuperC{ void print() {} } //OK
class SubD extends SuperD{ void print() {} } //NG