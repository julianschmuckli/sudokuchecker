package jeddsan.net.sudoku;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	
	int[] pre_aa = new int[3];
	int[] pre_ab = new int[3];
	int[] pre_ac = new int[3];
	
	int[] pre_ba = new int[3];
	int[] pre_bb = new int[3];
	int[] pre_bc = new int[3];
	
	int[] pre_ca = new int[3];
	int[] pre_cb = new int[3];
	int[] pre_cc = new int[3];
	
	int[] pre_da = new int[3];
	int[] pre_db = new int[3];
	int[] pre_dc = new int[3];
	
	int[] pre_ea = new int[3];
	int[] pre_eb = new int[3];
	int[] pre_ec = new int[3];
	
	int[] pre_fa = new int[3];
	int[] pre_fb = new int[3];
	int[] pre_fc = new int[3];
	
	int[] pre_ga = new int[3];
	int[] pre_gb = new int[3];
	int[] pre_gc = new int[3];
	
	int[] pre_ha = new int[3];
	int[] pre_hb = new int[3];
	int[] pre_hc = new int[3];
	
	int[] pre_ia = new int[3];
	int[] pre_ib = new int[3];
	int[] pre_ic = new int[3];
	
	
	boolean[] bool_aa = new boolean[3];
	boolean[] bool_ab = new boolean[3];
	boolean[] bool_ac = new boolean[3];

	boolean[] bool_ba = new boolean[3];
	boolean[] bool_bb = new boolean[3];
	boolean[] bool_bc = new boolean[3];

	boolean[] bool_ca = new boolean[3];
	boolean[] bool_cb = new boolean[3];
	boolean[] bool_cc = new boolean[3];

	boolean[] bool_da = new boolean[3];
	boolean[] bool_db = new boolean[3];
	boolean[] bool_dc = new boolean[3];

	boolean[] bool_ea = new boolean[3];
	boolean[] bool_eb = new boolean[3];
	boolean[] bool_ec = new boolean[3];

	boolean[] bool_fa = new boolean[3];
	boolean[] bool_fb = new boolean[3];
	boolean[] bool_fc = new boolean[3];

	boolean[] bool_ga = new boolean[3];
	boolean[] bool_gb = new boolean[3];
	boolean[] bool_gc = new boolean[3];

	boolean[] bool_ha = new boolean[3];
	boolean[] bool_hb = new boolean[3];
	boolean[] bool_hc = new boolean[3];

	boolean[] bool_ia = new boolean[3];
	boolean[] bool_ib = new boolean[3];
	boolean[] bool_ic = new boolean[3];
	
	
	String[] board_arr;
	int i = 0;
	int i_c = 0;
	int w_c = 0;
	int min_i=1;
	TextView result;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button button= (Button) findViewById(R.id.calculate);
		result = (TextView) findViewById(R.id.result);
		button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calculate();
				}
			});
    }
	public void calculate(){
		EditText board = (EditText) findViewById(R.id.board);
		String board_str = String.valueOf(board.getText()).trim();
		board.setText(board_str);
		if(board_str.length()==89){
			board_arr=board_str.split("");
			//Toast.makeText(getApplicationContext(), board_arr[11]+"h", Toast.LENGTH_SHORT).show();
			for(i=0;i<3;i++){
				pre_aa[i]=Integer.parseInt(board_arr[i+1]);
				pre_ab[i]=Integer.parseInt(board_arr[i+1+3]);
				pre_ac[i]=Integer.parseInt(board_arr[i+1+6]);
				
				pre_ba[i]=Integer.parseInt(board_arr[i+2+9]);
				pre_bb[i]=Integer.parseInt(board_arr[i+2+12]);
				pre_bc[i]=Integer.parseInt(board_arr[i+2+15]);
				
				pre_ca[i]=Integer.parseInt(board_arr[i+3+18]);
				pre_cb[i]=Integer.parseInt(board_arr[i+3+21]);
				pre_cc[i]=Integer.parseInt(board_arr[i+3+24]);
				
				pre_da[i]=Integer.parseInt(board_arr[i+4+27]);
				pre_db[i]=Integer.parseInt(board_arr[i+4+30]);
				pre_dc[i]=Integer.parseInt(board_arr[i+4+33]);
				
				pre_ea[i]=Integer.parseInt(board_arr[i+5+36]);
				pre_eb[i]=Integer.parseInt(board_arr[i+5+39]);
				pre_ec[i]=Integer.parseInt(board_arr[i+5+42]);
				
				pre_fa[i]=Integer.parseInt(board_arr[i+6+45]);
				pre_fb[i]=Integer.parseInt(board_arr[i+6+48]);
				pre_fc[i]=Integer.parseInt(board_arr[i+6+51]);
				
				pre_ga[i]=Integer.parseInt(board_arr[i+7+54]);
				pre_gb[i]=Integer.parseInt(board_arr[i+7+57]);
				pre_gc[i]=Integer.parseInt(board_arr[i+7+60]);
				
				pre_ha[i]=Integer.parseInt(board_arr[i+8+63]);
				pre_hb[i]=Integer.parseInt(board_arr[i+8+66]);
				pre_hc[i]=Integer.parseInt(board_arr[i+8+69]);

				pre_ia[i]=Integer.parseInt(board_arr[i+9+72]);
				pre_ib[i]=Integer.parseInt(board_arr[i+9+75]);
				pre_ic[i]=Integer.parseInt(board_arr[i+9+78]);
			}
			sudoku();
		}else{
			Toast.makeText(getApplicationContext(), "Bitte alle 81 Felder ausfüllen. Bisher: "+board_str.length(), Toast.LENGTH_SHORT).show();
		}
	}
	public void sudoku(){
		
		w_c=0;
		
		while(true){
			bool_aa[0]=false;
			bool_aa[1]=false;
			bool_aa[2]=false;
			
			bool_ab[0]=false;
			bool_ab[1]=false;
			bool_ab[2]=false;
			
			bool_ac[0]=false;
			bool_ac[1]=false;
			bool_ac[2]=false;
			
			bool_ba[0]=false;
			bool_ba[1]=false;
			bool_ba[2]=false;

			bool_bb[0]=false;
			bool_bb[1]=false;
			bool_bb[2]=false;

			bool_bc[0]=false;
			bool_bc[1]=false;
			bool_bc[2]=false;
			
			bool_ca[0]=false;
			bool_ca[1]=false;
			bool_ca[2]=false;

			bool_cb[0]=false;
			bool_cb[1]=false;
			bool_cb[2]=false;

			bool_cc[0]=false;
			bool_cc[1]=false;
			bool_cc[2]=false;
			
			bool_da[0]=false;
			bool_da[1]=false;
			bool_da[2]=false;

			bool_db[0]=false;
			bool_db[1]=false;
			bool_db[2]=false;

			bool_dc[0]=false;
			bool_dc[1]=false;
			bool_dc[2]=false;
			
			bool_ea[0]=false;
			bool_ea[1]=false;
			bool_ea[2]=false;

			bool_eb[0]=false;
			bool_eb[1]=false;
			bool_eb[2]=false;

			bool_ec[0]=false;
			bool_ec[1]=false;
			bool_ec[2]=false;
			
			bool_fa[0]=false;
			bool_fa[1]=false;
			bool_fa[2]=false;

			bool_fb[0]=false;
			bool_fb[1]=false;
			bool_fb[2]=false;

			bool_fc[0]=false;
			bool_fc[1]=false;
			bool_fc[2]=false;
			
			bool_ga[0]=false;
			bool_ga[1]=false;
			bool_ga[2]=false;

			bool_gb[0]=false;
			bool_gb[1]=false;
			bool_gb[2]=false;

			bool_gc[0]=false;
			bool_gc[1]=false;
			bool_gc[2]=false;
			
			bool_ha[0]=false;
			bool_ha[1]=false;
			bool_ha[2]=false;

			bool_hb[0]=false;
			bool_hb[1]=false;
			bool_hb[2]=false;

			bool_hc[0]=false;
			bool_hc[1]=false;
			bool_hc[2]=false;
			
			bool_ia[0]=false;
			bool_ia[1]=false;
			bool_ia[2]=false;

			bool_ib[0]=false;
			bool_ib[1]=false;
			bool_ib[2]=false;

			bool_ic[0]=false;
			bool_ic[1]=false;
			bool_ic[2]=false;
			
				if(pre_aa[0]==0){
					for(i_c=min_i;i_c<10;i_c++){
						if(pre_aa[1]==i_c||pre_aa[2]==i_c||
							pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
							pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
							
						    pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||
							pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||
							
							pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c||
						    pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){
							
						}else{
							//Zahl gefunden
							if(bool_aa[0]){
								pre_aa[0]=0;
							}else{
								pre_aa[0]=i_c;
								bool_aa[0]=true;
							}
						}
					}
				}
			if(pre_aa[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[0]==i_c||pre_aa[2]==i_c||
					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||

					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_aa[1]){
							pre_aa[1]=0;
						}else{
							pre_aa[1]=i_c;
							bool_aa[1]=true;
						}
					}
				}
			}
			if(pre_aa[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[0]==i_c||
					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||

					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_aa[2]){
							pre_aa[2]=0;
						}else{
							pre_aa[2]=i_c;
							bool_aa[2]=true;
						}
					}
				}
			}
			if(pre_ba[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ba[0]){
							pre_ba[0]=0;
						}else{
							pre_ba[0]=i_c;
							bool_ba[0]=true;
						}
					}
				}
			}
			if(pre_ba[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ba[2]==i_c||
					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ba[1]){
							pre_ba[1]=0;
						}else{
							pre_ba[1]=i_c;
							bool_ba[1]=true;
						}
					}
				}
			}
			if(pre_ba[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[1]==i_c||pre_ba[0]==i_c||
					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ba[2]){
							pre_ba[2]=0;
						}else{
							pre_ba[2]=i_c;
							bool_ba[2]=true;
						}
					}
				}
			}
			if(pre_ca[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ba[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||

					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ca[0]){
							pre_ca[0]=0;
						}else{
							pre_ca[0]=i_c;
							bool_ca[0]=true;
						}
					}
				}
			}
			if(pre_ca[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ba[0]==i_c||pre_ca[0]==i_c||pre_ca[2]==i_c||

					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ca[1]){
							pre_ca[1]=0;
						}else{
							pre_ca[1]=i_c;
							bool_ca[1]=true;
						}
					}
				}
			}
			if(pre_ca[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_aa[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_ba[0]==i_c||pre_ca[1]==i_c||pre_ca[0]==i_c||

					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ca[2]){
							pre_ca[2]=0;
						}else{
							pre_ca[2]=i_c;
							bool_ca[2]=true;
						}
					}
				}
			}
			
			
			if(pre_ab[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||

					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ab[0]){
							pre_ab[0]=0;
						}else{
							pre_ab[0]=i_c;
							bool_ab[0]=true;
						}
					}
				}
			}
			if(pre_ab[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[0]==i_c||pre_ab[2]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||

					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ab[1]){
							pre_ab[1]=0;
						}else{
							pre_ab[1]=i_c;
							bool_ab[1]=true;
						}
					}
				}
			}
			if(pre_ab[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[0]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ac[0]==i_c||pre_ac[1]==i_c||pre_ac[2]==i_c||

					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ab[2]){
							pre_ab[2]=0;
						}else{
							pre_ab[2]=i_c;
							bool_ab[2]=true;
						}
					}
				}
			}
			if(pre_bb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bb[0]){
							pre_bb[0]=0;
						}else{
							pre_bb[0]=i_c;
							bool_bb[0]=true;
						}
					}
				}
			}
			if(pre_bb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_bb[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bb[1]){
							pre_bb[1]=0;
						}else{
							pre_bb[1]=i_c;
							bool_bb[1]=true;
						}
					}
				}
			}
			if(pre_bb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[1]==i_c||pre_bb[0]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||

					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bb[2]){
							pre_bb[2]=0;
						}else{
							pre_bb[2]=i_c;
							bool_bb[2]=true;
						}
					}
				}
			}
			if(pre_cb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cb[0]){
							pre_cb[0]=0;
						}else{
							pre_cb[0]=i_c;
							bool_cb[0]=true;
						}
					}
				}
			}
			if(pre_cb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bb[0]==i_c||pre_cb[0]==i_c||pre_cb[2]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cb[1]){
							pre_cb[1]=0;
						}else{
							pre_cb[1]=i_c;
							bool_cb[1]=true;
						}
					}
				}
			}
			if(pre_cb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ab[1]==i_c||pre_ab[2]==i_c||
					   pre_ab[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||
					   pre_bb[0]==i_c||pre_cb[1]==i_c||pre_cb[0]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cb[2]){
							pre_cb[2]=0;
						}else{
							pre_cb[2]=i_c;
							bool_cb[2]=true;
						}
					}
				}
			}
			
			
			if(pre_ac[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||

					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ac[0]){
							pre_ac[0]=0;
						}else{
							pre_ac[0]=i_c;
							bool_ac[0]=true;
						}
					}
				}
			}
			if(pre_ac[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[0]==i_c||pre_ac[2]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||

					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ac[1]){
							pre_ac[1]=0;
						}else{
							pre_ac[1]=i_c;
							bool_ac[1]=true;
						}
					}
				}
			}
			if(pre_ac[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[0]==i_c||
					   pre_bc[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_aa[0]==i_c||pre_aa[1]==i_c||pre_aa[2]==i_c||
					   pre_ab[0]==i_c||pre_ab[1]==i_c||pre_ab[2]==i_c||

					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ac[2]){
							pre_ac[2]=0;
						}else{
							pre_ac[2]=i_c;
							bool_ac[2]=true;
						}
					}
				}
			}
			if(pre_bc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[1]==i_c||pre_bc[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||

					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bc[0]){
							pre_bc[0]=0;
						}else{
							pre_bc[0]=i_c;
							bool_bc[0]=true;
						}
					}
				}
			}
			if(pre_bc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_bc[2]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||

					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bc[1]){
							pre_bc[1]=0;
						}else{
							pre_bc[1]=i_c;
							bool_bc[1]=true;
						}
					}
				}
			}
			if(pre_bc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[1]==i_c||pre_bc[0]==i_c||
					   pre_cc[0]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_ba[0]==i_c||pre_ba[1]==i_c||pre_ba[2]==i_c||
					   pre_bb[0]==i_c||pre_bb[1]==i_c||pre_bb[2]==i_c||

					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_bc[2]){
							pre_bc[2]=0;
						}else{
							pre_bc[2]=i_c;
							bool_bc[2]=true;
						}
					}
				}
			}
			if(pre_cc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[1]==i_c||pre_bc[0]==i_c||
					   pre_bc[2]==i_c||pre_cc[1]==i_c||pre_cc[2]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cc[0]){
							pre_cc[0]=0;
						}else{
							pre_cc[0]=i_c;
							bool_cc[0]=true;
						}
					}
				}
			}
			if(pre_cc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[1]==i_c||pre_bc[0]==i_c||
					   pre_bc[2]==i_c||pre_cc[0]==i_c||pre_cc[2]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cc[1]){
							pre_cc[1]=0;
						}else{
							pre_cc[1]=i_c;
							bool_cc[1]=true;
						}
					}
				}
			}
			if(pre_cc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ac[1]==i_c||pre_ac[2]==i_c||
					   pre_ac[0]==i_c||pre_bc[1]==i_c||pre_bc[0]==i_c||
					   pre_bc[2]==i_c||pre_cc[0]==i_c||pre_cc[1]==i_c||

					   pre_ca[0]==i_c||pre_ca[1]==i_c||pre_ca[2]==i_c||
					   pre_cb[0]==i_c||pre_cb[1]==i_c||pre_cb[2]==i_c||

					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_cc[2]){
							pre_cc[2]=0;
						}else{
							pre_cc[2]=i_c;
							bool_cc[2]=true;
						}
					}
				}
			}
			
			
			if(pre_da[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[1]==i_c||pre_da[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_da[0]){
							pre_da[0]=0;
						}else{
							pre_da[0]=i_c;
							bool_da[0]=true;
						}
					}
				}
			}
			if(pre_da[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_da[1]){
							pre_da[1]=0;
						}else{
							pre_da[1]=i_c;
							bool_da[1]=true;
						}
					}
				}
			}
			if(pre_da[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_da[2]){
							pre_da[2]=0;
						}else{
							pre_da[2]=i_c;
							bool_da[2]=true;
						}
					}
				}
			}
			if(pre_ea[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ea[0]){
							pre_ea[0]=0;
						}else{
							pre_ea[0]=i_c;
							bool_ea[0]=true;
						}
					}
				}
			}
			if(pre_ea[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[0]==i_c||pre_ea[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ea[1]){
							pre_ea[1]=0;
						}else{
							pre_ea[1]=i_c;
							bool_ea[1]=true;
						}
					}
				}
			}
			if(pre_ea[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[0]==i_c||pre_ea[1]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ea[2]){
							pre_ea[2]=0;
						}else{
							pre_ea[2]=i_c;
							bool_ea[2]=true;
						}
					}
				}
			}
			if(pre_fa[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[0]==i_c||pre_ea[1]==i_c||
					   pre_ea[2]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ia[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fa[0]){
							pre_fa[0]=0;
						}else{
							pre_fa[0]=i_c;
							bool_fa[0]=true;
						}
					}
				}
			}
			if(pre_fa[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[0]==i_c||pre_ea[1]==i_c||
					   pre_ea[2]==i_c||pre_fa[0]==i_c||pre_fa[2]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_ga[1]==i_c||pre_ha[1]==i_c||pre_ia[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fa[1]){
							pre_fa[1]=0;
						}else{
							pre_fa[1]=i_c;
							bool_fa[1]=true;
						}
					}
				}
			}
			if(pre_fa[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_da[0]==i_c||pre_da[1]==i_c||
					   pre_da[2]==i_c||pre_ea[0]==i_c||pre_ea[1]==i_c||
					   pre_ea[2]==i_c||pre_fa[1]==i_c||pre_fa[0]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_ga[2]==i_c||pre_ha[2]==i_c||pre_ia[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fa[2]){
							pre_fa[2]=0;
						}else{
							pre_fa[2]=i_c;
							bool_fa[2]=true;
						}
					}
				}
			}
			if(pre_db[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_db[0]){
							pre_db[0]=0;
						}else{
							pre_db[0]=i_c;
							bool_db[0]=true;
						}
					}
				}
			}
			if(pre_db[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[0]==i_c||pre_db[2]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_db[1]){
							pre_db[1]=0;
						}else{
							pre_db[1]=i_c;
							bool_db[1]=true;
						}
					}
				}
			}
			if(pre_db[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[0]==i_c||
					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_dc[0]==i_c||pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_db[2]){
							pre_db[2]=0;
						}else{
							pre_db[2]=i_c;
							bool_db[2]=true;
						}
					}
				}
			}
			if(pre_eb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_eb[0]){
							pre_eb[0]=0;
						}else{
							pre_eb[0]=i_c;
							bool_eb[0]=true;
						}
					}
				}
			}
			if(pre_eb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_eb[2]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_eb[1]){
							pre_eb[1]=0;
						}else{
							pre_eb[1]=i_c;
							bool_eb[1]=true;
						}
					}
				}
			}
			if(pre_eb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[1]==i_c||pre_eb[0]==i_c||
					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_eb[2]){
							pre_eb[2]=0;
						}else{
							pre_eb[2]=i_c;
							bool_eb[2]=true;
						}
					}
				}
			}
			if(pre_fb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_eb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_ib[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fb[0]){
							pre_fb[0]=0;
						}else{
							pre_fb[0]=i_c;
							bool_fb[0]=true;
						}
					}
				}
			}
			if(pre_fb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_eb[0]==i_c||pre_fb[0]==i_c||pre_fb[2]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_gb[1]==i_c||pre_hb[1]==i_c||pre_ib[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fb[1]){
							pre_fb[1]=0;
						}else{
							pre_fb[1]=i_c;
							bool_fb[1]=true;
						}
					}
				}
			}
			if(pre_fb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_db[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_eb[0]==i_c||pre_fb[0]==i_c||pre_fb[1]==i_c||

					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_gb[2]==i_c||pre_hb[2]==i_c||pre_ib[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fb[2]){
							pre_fb[2]=0;
						}else{
							pre_fb[2]=i_c;
							bool_fb[2]=true;
						}
					}
				}
			}
			if(pre_dc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_dc[0]){
							pre_dc[0]=0;
						}else{
							pre_dc[0]=i_c;
							bool_dc[0]=true;
						}
					}
				}
			}
			if(pre_dc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[0]==i_c||pre_dc[2]==i_c||
					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_dc[1]){
							pre_dc[1]=0;
						}else{
							pre_dc[1]=i_c;
							bool_dc[1]=true;
						}
					}
				}
			}
			if(pre_dc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[0]==i_c||pre_dc[1]==i_c||
					   pre_ec[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_db[0]==i_c||pre_db[1]==i_c||pre_db[2]==i_c||
					   pre_da[0]==i_c||pre_da[1]==i_c||pre_da[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_dc[2]){
							pre_dc[2]=0;
						}else{
							pre_dc[2]=i_c;
							bool_dc[2]=true;
						}
					}
				}
			}
			if(pre_ec[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[1]==i_c||pre_ec[2]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ec[0]){
							pre_ec[0]=0;
						}else{
							pre_ec[0]=i_c;
							bool_ec[0]=true;
						}
					}
				}
			}
			if(pre_ec[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_ec[2]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ec[1]){
							pre_ec[1]=0;
						}else{
							pre_ec[1]=i_c;
							bool_ec[1]=true;
						}
					}
				}
			}
			if(pre_ec[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_ec[1]==i_c||
					   pre_fc[0]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_eb[0]==i_c||pre_eb[1]==i_c||pre_eb[2]==i_c||
					   pre_ea[0]==i_c||pre_ea[1]==i_c||pre_ea[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ec[2]){
							pre_ec[2]=0;
						}else{
							pre_ec[2]=i_c;
							bool_ec[2]=true;
						}
					}
				}
			}
			if(pre_fc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_ec[1]==i_c||
					   pre_ec[2]==i_c||pre_fc[1]==i_c||pre_fc[2]==i_c||

					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_ic[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fc[0]){
							pre_fc[0]=0;
						}else{
							pre_fc[0]=i_c;
							bool_fc[0]=true;
						}
					}
				}
			}
			if(pre_fc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_ec[1]==i_c||
					   pre_ec[2]==i_c||pre_fc[0]==i_c||pre_fc[2]==i_c||

					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_gc[1]==i_c||pre_hc[1]==i_c||pre_ic[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fc[1]){
							pre_fc[1]=0;
						}else{
							pre_fc[1]=i_c;
							bool_fc[1]=true;
						}
					}
				}
			}
			if(pre_fc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_dc[1]==i_c||pre_dc[2]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_ec[1]==i_c||
					   pre_ec[2]==i_c||pre_fc[1]==i_c||pre_fc[0]==i_c||

					   pre_fb[0]==i_c||pre_fb[1]==i_c||pre_fb[2]==i_c||
					   pre_fa[0]==i_c||pre_fa[1]==i_c||pre_fa[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_gc[2]==i_c||pre_hc[2]==i_c||pre_ic[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_fc[2]){
							pre_fc[2]=0;
						}else{
							pre_fc[2]=i_c;
							bool_fc[2]=true;
						}
					}
				}
			}
			
			
			if(pre_ga[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ga[0]){
							pre_ga[0]=0;
						}else{
							pre_ga[0]=i_c;
							bool_ga[0]=true;
						}
					}
				}
			}
			if(pre_ga[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[0]==i_c||pre_ga[2]==i_c||
					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ga[1]){
							pre_ga[1]=0;
						}else{
							pre_ga[1]=i_c;
							bool_ga[1]=true;
						}
					}
				}
			}
			if(pre_ga[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[0]==i_c||
					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ga[2]){
							pre_ga[2]=0;
						}else{
							pre_ga[2]=i_c;
							bool_ga[2]=true;
						}
					}
				}
			}
			if(pre_ha[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ha[0]){
							pre_ha[0]=0;
						}else{
							pre_ha[0]=i_c;
							bool_ha[0]=true;
						}
					}
				}
			}
			if(pre_ha[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[0]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ha[1]){
							pre_ha[1]=0;
						}else{
							pre_ha[1]=i_c;
							bool_ha[1]=true;
						}
					}
				}
			}
			if(pre_ha[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ha[2]){
							pre_ha[2]=0;
						}else{
							pre_ha[2]=i_c;
							bool_ha[2]=true;
						}
					}
				}
			}
			if(pre_ia[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ha[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||

					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_aa[0]==i_c||pre_ba[0]==i_c||pre_ca[0]==i_c||
					   pre_da[0]==i_c||pre_ea[0]==i_c||pre_fa[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ia[0]){
							pre_ia[0]=0;
						}else{
							pre_ia[0]=i_c;
							bool_ia[0]=true;
						}
					}
				}
			}
			if(pre_ia[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ha[0]==i_c||pre_ia[0]==i_c||pre_ia[2]==i_c||

					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_aa[1]==i_c||pre_ba[1]==i_c||pre_ca[1]==i_c||
					   pre_da[1]==i_c||pre_ea[1]==i_c||pre_fa[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ia[1]){
							pre_ia[1]=0;
						}else{
							pre_ia[1]=i_c;
							bool_ia[1]=true;
						}
					}
				}
			}
			if(pre_ia[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_ga[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_ha[0]==i_c||pre_ia[1]==i_c||pre_ia[0]==i_c||

					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_aa[2]==i_c||pre_ba[2]==i_c||pre_ca[2]==i_c||
					   pre_da[2]==i_c||pre_ea[2]==i_c||pre_fa[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ia[2]){
							pre_ia[2]=0;
						}else{
							pre_ia[2]=i_c;
							bool_ia[2]=true;
						}
					}
				}
			}
			if(pre_gb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gb[0]){
							pre_gb[0]=0;
						}else{
							pre_gb[0]=i_c;
							bool_gb[0]=true;
						}
					}
				}
			}
			if(pre_gb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[0]==i_c||pre_gb[2]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gb[1]){
							pre_gb[1]=0;
						}else{
							pre_gb[1]=i_c;
							bool_gb[1]=true;
						}
					}
				}
			}
			if(pre_gb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[0]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gc[0]==i_c||pre_gc[1]==i_c||pre_gc[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gb[2]){
							pre_gb[2]=0;
						}else{
							pre_gb[2]=i_c;
							bool_gb[2]=true;
						}
					}
				}
			}
			if(pre_hb[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hb[0]){
							pre_hb[0]=0;
						}else{
							pre_hb[0]=i_c;
							bool_hb[0]=true;
						}
					}
				}
			}
			if(pre_hb[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[0]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hb[1]){
							pre_hb[1]=0;
						}else{
							pre_hb[1]=i_c;
							bool_hb[1]=true;
						}
					}
				}
			}
			if(pre_hb[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hb[2]){
							pre_hb[2]=0;
						}else{
							pre_hb[2]=i_c;
							bool_hb[2]=true;
						}
					}
				}
			}
			if(pre_ib[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hb[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ab[0]==i_c||pre_bb[0]==i_c||pre_cb[0]==i_c||
					   pre_db[0]==i_c||pre_eb[0]==i_c||pre_fb[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ib[0]){
							pre_ib[0]=0;
						}else{
							pre_ib[0]=i_c;
							bool_ib[0]=true;
						}
					}
				}
			}
			if(pre_ib[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hb[0]==i_c||pre_ib[0]==i_c||pre_ib[2]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ab[1]==i_c||pre_bb[1]==i_c||pre_cb[1]==i_c||
					   pre_db[1]==i_c||pre_eb[1]==i_c||pre_fb[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ib[1]){
							pre_ib[1]=0;
						}else{
							pre_ib[1]=i_c;
							bool_ib[1]=true;
						}
					}
				}
			}
			if(pre_ib[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gb[1]==i_c||pre_gb[2]==i_c||
					   pre_gb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||
					   pre_hb[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ab[2]==i_c||pre_bb[2]==i_c||pre_cb[2]==i_c||
					   pre_db[2]==i_c||pre_eb[2]==i_c||pre_fb[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ib[2]){
							pre_ib[2]=0;
						}else{
							pre_ib[2]=i_c;
							bool_ib[2]=true;
						}
					}
				}
			}
			if(pre_gc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gc[0]){
							pre_gc[0]=0;
						}else{
							pre_gc[0]=i_c;
							bool_gc[0]=true;
						}
					}
				}
			}
			if(pre_gc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[0]==i_c||pre_gc[2]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gc[1]){
							pre_gc[1]=0;
						}else{
							pre_gc[1]=i_c;
							bool_gc[1]=true;
						}
					}
				}
			}
			if(pre_gc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[0]==i_c||
					   pre_hc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ga[0]==i_c||pre_ga[1]==i_c||pre_ga[2]==i_c||
					   pre_gb[0]==i_c||pre_gb[1]==i_c||pre_gb[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_gc[2]){
							pre_gc[2]=0;
						}else{
							pre_gc[2]=i_c;
							bool_gc[2]=true;
						}
					}
				}
			}
			if(pre_hc[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hc[0]){
							pre_hc[0]=0;
						}else{
							pre_hc[0]=i_c;
							bool_hc[0]=true;
						}
					}
				}
			}
			if(pre_hc[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[0]==i_c||pre_hc[2]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hc[1]){
							pre_hc[1]=0;
						}else{
							pre_hc[1]=i_c;
							bool_hc[1]=true;
						}
					}
				}
			}
			if(pre_hc[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[1]==i_c||pre_hc[0]==i_c||
					   pre_ic[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ha[0]==i_c||pre_ha[1]==i_c||pre_ha[2]==i_c||
					   pre_hb[0]==i_c||pre_hb[1]==i_c||pre_hb[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_hc[2]){
							pre_hc[2]=0;
						}else{
							pre_hc[2]=i_c;
							bool_hc[2]=true;
						}
					}
				}
			}
			if(pre_ic[0]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_hc[0]==i_c||pre_ic[1]==i_c||pre_ic[2]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ac[0]==i_c||pre_bc[0]==i_c||pre_cc[0]==i_c||
					   pre_dc[0]==i_c||pre_ec[0]==i_c||pre_fc[0]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ic[0]){
							pre_ic[0]=0;
						}else{
							pre_ic[0]=i_c;
							bool_ic[0]=true;
						}
					}
				}
			}
			if(pre_ic[1]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_hc[0]==i_c||pre_ic[0]==i_c||pre_ic[2]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ac[1]==i_c||pre_bc[1]==i_c||pre_cc[1]==i_c||
					   pre_dc[1]==i_c||pre_ec[1]==i_c||pre_fc[1]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ic[1]){
							pre_ic[1]=0;
						}else{
							pre_ic[1]=i_c;
							bool_ic[1]=true;
						}
					}
				}
			}
			if(pre_ic[2]==0){
				for(i_c=min_i;i_c<10;i_c++){
					if(pre_gc[1]==i_c||pre_gc[2]==i_c||
					   pre_gc[0]==i_c||pre_hc[1]==i_c||pre_hc[2]==i_c||
					   pre_hc[0]==i_c||pre_ic[1]==i_c||pre_ic[0]==i_c||

					   pre_ia[0]==i_c||pre_ia[1]==i_c||pre_ia[2]==i_c||
					   pre_ib[0]==i_c||pre_ib[1]==i_c||pre_ib[2]==i_c||

					   pre_ac[2]==i_c||pre_bc[2]==i_c||pre_cc[2]==i_c||
					   pre_dc[2]==i_c||pre_ec[2]==i_c||pre_fc[2]==i_c){

					}else{
						//Zahl gefunden
						if(bool_ic[2]){
							pre_ic[2]=0;
						}else{
							pre_ic[2]=i_c;
							bool_ic[2]=true;
						}
					}
				}
			}
			w_c++;
			if(w_c<=100){
				/*if(pre_ab[0]==0){
					
				}else{
					break;
				}*/
			}else{
				break;
			}
		}
		String result_str = pre_aa[0]+"."+pre_aa[1]+"."+pre_aa[2]+"|"
			+pre_ab[0]+"."+pre_ab[1]+"."+pre_ab[2]+"|"
			+pre_ac[0]+"."+pre_ac[1]+"."+pre_ac[2]+"\n"
			+pre_ba[0]+"."+pre_ba[1]+"."+pre_ba[2]+"|"
			+pre_bb[0]+"."+pre_bb[1]+"."+pre_bb[2]+"|"
			+pre_bc[0]+"."+pre_bc[1]+"."+pre_bc[2]+"\n"
			+pre_ca[0]+"."+pre_ca[1]+"."+pre_ca[2]+"|"
			+pre_cb[0]+"."+pre_cb[1]+"."+pre_cb[2]+"|"
			+pre_cc[0]+"."+pre_cc[1]+"."+pre_cc[2]+"\n"+
			"--------------------------\n"+
			pre_da[0]+"."+pre_da[1]+"."+pre_da[2]+"|"
			+pre_db[0]+"."+pre_db[1]+"."+pre_db[2]+"|"
			+pre_dc[0]+"."+pre_dc[1]+"."+pre_dc[2]+"\n"
			+pre_ea[0]+"."+pre_ea[1]+"."+pre_ea[2]+"|"
			+pre_eb[0]+"."+pre_eb[1]+"."+pre_eb[2]+"|"
			+pre_ec[0]+"."+pre_ec[1]+"."+pre_ec[2]+"\n"
			+pre_fa[0]+"."+pre_fa[1]+"."+pre_fa[2]+"|"
			+pre_fb[0]+"."+pre_fb[1]+"."+pre_fb[2]+"|"
			+pre_fc[0]+"."+pre_fc[1]+"."+pre_fc[2]+"\n"+
			"--------------------------\n"+
			pre_ga[0]+"."+pre_ga[1]+"."+pre_ga[2]+"|"
			+pre_gb[0]+"."+pre_gb[1]+"."+pre_gb[2]+"|"
			+pre_gc[0]+"."+pre_gc[1]+"."+pre_gc[2]+"\n"
			+pre_ha[0]+"."+pre_ha[1]+"."+pre_ha[2]+"|"
			+pre_hb[0]+"."+pre_hb[1]+"."+pre_hb[2]+"|"
			+pre_hc[0]+"."+pre_hc[1]+"."+pre_hc[2]+"\n"
			+pre_ia[0]+"."+pre_ia[1]+"."+pre_ia[2]+"|"
			+pre_ib[0]+"."+pre_ib[1]+"."+pre_ib[2]+"|"
			+pre_ic[0]+"."+pre_ic[1]+"."+pre_ic[2]+"\n";
			result.setText(result_str);
		//Toast.makeText(getApplicationContext(), w_c+"", Toast.LENGTH_SHORT).show();
	}
}
