using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentGradeApplicationn
{
    public partial class frmStudentGradeProgram : Form
    {
        public frmStudentGradeProgram()
        {
            InitializeComponent();
        }

        

        private void button1_Click(object sender, EventArgs e)
        {
            double english = Convert.ToDouble(textBox3.Text);
            double math = Convert.ToDouble(textBox4.Text);
            double science = Convert.ToDouble(textBox5.Text);
            double filipino = Convert.ToDouble(textBox6.Text);
            double history = Convert.ToDouble(textBox7.Text);

            double average = (double)(english + math + science + filipino + history) / 5;
            label2.Visible = true;
            label4.Visible = true;

            string result = average >= 75.00 ? label4.Text = $"\tStudent Passed\nThe general average of {textBox1.Text} is {average}"
                : label4.Text = $"\tStudent Failed\nThe general average of {textBox1.Text}is {average}";
            
        }

        private void English(object sender, EventArgs e)
        {
           int english = Convert.ToInt32(Console.ReadLine());
           
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void name_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
