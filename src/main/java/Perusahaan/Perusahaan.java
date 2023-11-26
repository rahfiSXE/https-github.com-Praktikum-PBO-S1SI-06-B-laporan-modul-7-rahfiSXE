package Perusahaan;

// Class Perusahaan
class Perusahaan
{
    private String namaPer;
    private Pegawai[] peg = null; //Agregasi antara pegawai dan perusahaan
    private int counter;

    public Perusahaan(String namaPer)
    {
        this.namaPer=namaPer;
        counter=0;
    }

    //Relasi agregasi antara pegawai dan perusahaan
    public void insertPegawai(Pegawai p)
    {
        if (peg == null) {
            peg = new Pegawai[3];
        }

        peg[counter]=p;
        counter++;
    }

    public void tampilPer()
    {
        System.out.println("Perusahaan "+namaPer+" memiliki pegawai : ");
        for(int i=0; i<counter; i++)
        {
            peg[i].tampilPeg();
        }
    }
}