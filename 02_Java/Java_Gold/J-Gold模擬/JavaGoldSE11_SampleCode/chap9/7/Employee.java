import java.io.Serializable;

// �N���X��`����implements Serializable�ƋL�q
public class Employee implements Serializable {
  private int id;
  private String name;
  public Employee(int id, String name) {
    this.id = id; this.name = name;
  }
  // Serializable�C���^�t�F�[�X�̓��\�b�h�������Ȃ�����
  // �I�[�o�[���C�h���Ȃ���΂Ȃ�Ȃ����\�b�h�͂Ȃ�
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
}
