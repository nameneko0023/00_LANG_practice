using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ログイン
{
   
    public partial class LOGIN : Form
    {
        public LOGIN()
        {
            InitializeComponent();
        }

        private void LOGIN_BTN_Click(object sender, EventArgs e)
        {
            //
            LOGIN_TXT.BackColor = System.Drawing.SystemColors.Window;
            PASS_TXT.BackColor = System.Drawing.SystemColors.Window;



            LOGIN_TXT.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));

            PASS_TXT.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));

        }
    }

    class CHECK_RESULT
    {
        //フラグ初期化
        private int Login_Flg = 0; //(0:8文字以上　1:８文字以下)
        private int Pass_Flr = 0;  //(0:8文字以上　1:８文字以下)
        private Check_Result = false;
            
    }
}