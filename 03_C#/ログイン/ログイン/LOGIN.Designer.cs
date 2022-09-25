
namespace ログイン
{
    partial class LOGIN
    {
        /// <summary>
        /// 必要なデザイナー変数です。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 使用中のリソースをすべてクリーンアップします。
        /// </summary>
        /// <param name="disposing">マネージド リソースを破棄する場合は true を指定し、その他の場合は false を指定します。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows フォーム デザイナーで生成されたコード

        /// <summary>
        /// デザイナー サポートに必要なメソッドです。このメソッドの内容を
        /// コード エディターで変更しないでください。
        /// </summary>
        private void InitializeComponent()
        {
            this.LOGIN_ID_LAB = new System.Windows.Forms.Label();
            this.PASS_LAB = new System.Windows.Forms.Label();
            this.LOGIN_TXT = new System.Windows.Forms.TextBox();
            this.PASS_TXT = new System.Windows.Forms.TextBox();
            this.PASS_SEIYAKU = new System.Windows.Forms.Label();
            this.LOGIN_SEIYAKU = new System.Windows.Forms.Label();
            this.LOGIN_BTN = new System.Windows.Forms.Button();
            this.ERR_MSG = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // LOGIN_ID_LAB
            // 
            this.LOGIN_ID_LAB.AutoSize = true;
            this.LOGIN_ID_LAB.Location = new System.Drawing.Point(68, 72);
            this.LOGIN_ID_LAB.Name = "LOGIN_ID_LAB";
            this.LOGIN_ID_LAB.Size = new System.Drawing.Size(52, 12);
            this.LOGIN_ID_LAB.TabIndex = 0;
            this.LOGIN_ID_LAB.Text = "ログインID";
            // 
            // PASS_LAB
            // 
            this.PASS_LAB.AutoSize = true;
            this.PASS_LAB.Location = new System.Drawing.Point(68, 148);
            this.PASS_LAB.Name = "PASS_LAB";
            this.PASS_LAB.Size = new System.Drawing.Size(52, 12);
            this.PASS_LAB.TabIndex = 1;
            this.PASS_LAB.Text = "パスワード";
            // 
            // LOGIN_TXT
            // 
            this.LOGIN_TXT.BackColor = System.Drawing.SystemColors.Window;
            this.LOGIN_TXT.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.LOGIN_TXT.Location = new System.Drawing.Point(70, 87);
            this.LOGIN_TXT.MaxLength = 12;
            this.LOGIN_TXT.Name = "LOGIN_TXT";
            this.LOGIN_TXT.Size = new System.Drawing.Size(185, 19);
            this.LOGIN_TXT.TabIndex = 2;
            // 
            // PASS_TXT
            // 
            this.PASS_TXT.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.PASS_TXT.Location = new System.Drawing.Point(70, 163);
            this.PASS_TXT.MaxLength = 12;
            this.PASS_TXT.Name = "PASS_TXT";
            this.PASS_TXT.Size = new System.Drawing.Size(185, 19);
            this.PASS_TXT.TabIndex = 3;
            // 
            // PASS_SEIYAKU
            // 
            this.PASS_SEIYAKU.AutoSize = true;
            this.PASS_SEIYAKU.Location = new System.Drawing.Point(68, 185);
            this.PASS_SEIYAKU.Name = "PASS_SEIYAKU";
            this.PASS_SEIYAKU.Size = new System.Drawing.Size(107, 12);
            this.PASS_SEIYAKU.TabIndex = 4;
            this.PASS_SEIYAKU.Text = "※英数字8～12文字";
            // 
            // LOGIN_SEIYAKU
            // 
            this.LOGIN_SEIYAKU.AutoSize = true;
            this.LOGIN_SEIYAKU.Location = new System.Drawing.Point(68, 109);
            this.LOGIN_SEIYAKU.Name = "LOGIN_SEIYAKU";
            this.LOGIN_SEIYAKU.Size = new System.Drawing.Size(107, 12);
            this.LOGIN_SEIYAKU.TabIndex = 5;
            this.LOGIN_SEIYAKU.Text = "※英数字8～12文字";
            // 
            // LOGIN_BTN
            // 
            this.LOGIN_BTN.BackColor = System.Drawing.Color.Red;
            this.LOGIN_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.LOGIN_BTN.Font = new System.Drawing.Font("ＭＳ ゴシック", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(128)));
            this.LOGIN_BTN.ForeColor = System.Drawing.Color.White;
            this.LOGIN_BTN.Location = new System.Drawing.Point(99, 235);
            this.LOGIN_BTN.Name = "LOGIN_BTN";
            this.LOGIN_BTN.Size = new System.Drawing.Size(107, 23);
            this.LOGIN_BTN.TabIndex = 6;
            this.LOGIN_BTN.Text = "ログインする";
            this.LOGIN_BTN.UseVisualStyleBackColor = false;
            this.LOGIN_BTN.Click += new System.EventHandler(this.LOGIN_BTN_Click);
            // 
            // ERR_MSG
            // 
            this.ERR_MSG.AutoSize = true;
            this.ERR_MSG.Location = new System.Drawing.Point(68, 220);
            this.ERR_MSG.Name = "ERR_MSG";
            this.ERR_MSG.Size = new System.Drawing.Size(0, 12);
            this.ERR_MSG.TabIndex = 7;
            // 
            // LOGIN
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(333, 323);
            this.Controls.Add(this.ERR_MSG);
            this.Controls.Add(this.LOGIN_BTN);
            this.Controls.Add(this.LOGIN_SEIYAKU);
            this.Controls.Add(this.PASS_SEIYAKU);
            this.Controls.Add(this.PASS_TXT);
            this.Controls.Add(this.LOGIN_TXT);
            this.Controls.Add(this.PASS_LAB);
            this.Controls.Add(this.LOGIN_ID_LAB);
            this.Name = "LOGIN";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LOGIN_ID_LAB;
        private System.Windows.Forms.Label PASS_LAB;
        private System.Windows.Forms.TextBox LOGIN_TXT;
        private System.Windows.Forms.TextBox PASS_TXT;
        private System.Windows.Forms.Label PASS_SEIYAKU;
        private System.Windows.Forms.Label LOGIN_SEIYAKU;
        private System.Windows.Forms.Button LOGIN_BTN;
        private System.Windows.Forms.Label ERR_MSG;
    }
}

