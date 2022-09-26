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
            CHECK_RESET();
            String[] logininfo = { };
            logininfo[0] = LOGIN_TXT.Text;
            logininfo[1] = PASS_TXT.Text;

            INPUT_CHECK(logininfo);



        }

        private void CHECK_RESET()
        {
            //
            LOGIN_TXT.BackColor = System.Drawing.SystemColors.Window;
            PASS_TXT.BackColor = System.Drawing.SystemColors.Window;

        }

        private void INPUT_CHECK(String [] LoginInfo)
        {
            String loginid = LoginInfo[0];
            String pass = LoginInfo[1];

            //文字数チェック
            if ()
            {

            }
            else
            {
                LOGIN_TXT.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            }

            if (passresult)
            {
                
            }
            else
            {
                PASS_TXT.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            }

            if
            
        }
    }

}