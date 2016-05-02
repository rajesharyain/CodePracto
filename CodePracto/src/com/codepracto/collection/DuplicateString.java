package com.codepracto.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateString {

	public DuplicateString() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "CEU_ID,2016-4193-CESUB,2015-2345-CESUB,2016-2617-CESUB,2016-7050-CESUB,2016-6186-CESUB,2015-3290-CESUB,2016-3619-CESUB,2016-3630-CESUB,2016-6131-CESUB,2015-3290-CESUB,2015-2354-CESUB,2015-2355-CESUB,2016-3614-CESUB,2016-5988-CESUB,2015-2133-CESUB,2016-5976-CESUB,2016-6601-CESUB,2016-6602-CESUB,2016-6575-CESUB,2016-6123-CESUB,2016-3636-CESUB,2016-3640-CESUB,2016-8141-CESUB,2016-6128-CESUB,2016-2466-CESUB,2016-3624-CESUB,2016-8143-CESUB,2016-4171-CESUB,2016-4070-CESUB,2016-8140-CESUB,2016-6146-CESUB,2016-7053-CESUB,2016-2476-CESUB,2016-2482-CESUB,2016-8148-CESUB,2016-2354-CESUB,2016-2361-CESUB,2016-2351-CESUB,2016-7738-CESUB,2016-2352-CESUB,2016-3993-CESUB,2016-3994-CESUB,2016-4178-CESUB,2016-3959-CESUB,2016-2362-CESUB,2015-2123-CESUB,2016-6187-CESUB,2016-6148-CESUB,2016-2475-CESUB,2016-2488-CESUB,2016-2612-CESUB,2016-2483-CESUB,2015-2139-CESUB,2016-7732-CESUB,2016-2613-CESUB,2016-3994-CESUB,2016-3993-CESUB,2016-2357-CESUB,2016-3618-CESUB,2016-5981-CESUB,2016-4207-CESUB,2015-2132-CESUB,2016-8139-CESUB,2016-4182-CESUB,2016-3613-CESUB,2016-3612-CESUB,2016-4183-CESUB,2016-2615-CESUB,2016-4186-CESUB,2016-6121-CESUB,2016-2611-CESUB,2016-3611-CESUB,2016-3967-CESUB,2016-3549-CESUB,2016-2485-CESUB,2016-4192-CESUB,2016-3621-CESUB,2015-2121-CESUB,2016-5975-CESUB,2016-8149-CESUB,2015-2128-CESUB,2016-7736-CESUB,2016-3966-CESUB,2016-5987-CESUB,2016-3968-CESUB,2016-6137-CESUB,2015-2122-CESUB,2016-7059-CESUB,2016-9139-CESUB,2016-2479-CESUB,2016-4184-CESUB,2015-2135-CESUB,2016-4179-CESUB,2016-8131-CESUB,2016-6116-CESUB,2016-9123-CESUB,2016-6135-CESUB,2016-3610-CESUB,2016-9251-CESUB,2016-2478-CESUB,2016-6188-CESUB,2016-6190-CESUB,2016-6191-CESUB,2016-7742-CESUB,2016-3682-CESUB,2015-2127-CESUB,2016-6115-CESUB,2015-2134-CESUB,2016-8133-CESUB,2016-5979-CESUB,2016-4200-CESUB,2016-3634-CESUB,2016-2465-CESUB,2016-3616-CESUB,2016-3623-CESUB,2016-6118-CESUB,2016-5973-CESUB,2016-7052-CESUB,2016-3604-CESUB,2016-3962-CESUB,2016-4169-CESUB,2016-2618-CESUB,16CAP-00007649,2016-345-CESUB,2016-644-CESUB,16CAP-00004906,2016-4198-CESUB,2016-3628-CESUB,2016-4167-CESUB,2016-4168-CESUB,2016-6147-CESUB,2016-2480-CESUB,2016-2468-CESUB,2016-2487-CESUB,2016-5974-CESUB,2016-3637-CESUB,2016-3958-CESUB,2015-2120-CESUB,2016-6126-CESUB,2016-8136-CESUB,2016-3772-CESUB,2015-2144-CESUB,2016-7733-CESUB,2016-4180-CESUB,2016-4210-CESUB,2016-8135-CESUB,2016-3964-CESUB,2016-4194-CESUB,2016-3606-CESUB,2016-6134-CESUB,2016-3626-CESUB,2016-6122-CESUB,2016-3961-CESUB,2016-6143-CESUB,2016-2477-CESUB,2016-8127-CESUB,2016-4188-CESUB,2016-3615-CESUB,2016-2610-CESUB,2016-4175-CESUB,2016-4189-CESUB,2016-8130-CESUB,2016-6132-CESUB,2015-2140-CESUB,2016-4191-CESUB,2016-5977-CESUB,2016-3956-CESUB,2016-3607-CESUB,2016-2474-CESUB,2016-4177-CESUB,2016-7741-CESUB,2016-7740-CESUB,2016-2614-CESUB,2016-6120-CESUB,2016-5984-CESUB,2016-3960-CESUB,2016-4208-CESUB,2016-3635-CESUB,2016-3631-CESUB,2016-8129-CESUB,2016-3643-CESUB,2016-4202-CESUB,2016-3963-CESUB,2016-5985-CESUB,2016-4199-CESUB,2016-3633-CESUB,2016-2473-CESUB,2016-7054-CESUB,2016-8145-CESUB,2016-8960-CESUB,2016-4170-CESUB,2016-9155-CESUB,2016-7048-CESUB,2016-8132-CESUB,2016-3965-CESUB,2016-5986-CESUB,2016-4190-CESUB,2016-4185-CESUB,2016-6119-CESUB,2016-7737-CESUB,2016-8142-CESUB,2016-2470-CESUB,2016-3700-CESUB,2016-8144-CESUB,2016-3681-CESUB,2016-4195-CESUB,2016-7735-CESUB,2016-3638-CESUB,2016-7057-CESUB,2016-3699-CESUB,2016-7744-CESUB,2015-2138-CESUB,2016-2616-CESUB,2016-2481-CESUB,2016-4206-CESUB,2015-2355-CESUB,2015-2354-CESUB,2016-9238-CESUB,2016-7049-CESUB,2016-3641-CESUB,2016-3771-CESUB,2016-8147-CESUB,2015-3296-CESUB,2015-3607-CESUB,2016-5972-CESUB,2016-9273-CESUB,2016-2471-CESUB,2016-6138-CESUB,2015-3290-CESUB,2016-6140-CESUB,2016-4172-CESUB,2016-7051-CESUB,2016-3629-CESUB,2016-2463-CESUB,2016-6124-CESUB,2016-4201-CESUB,2016-3683-CESUB,2016-2460-CESUB,2016-4197-CESUB,2016-6133-CESUB,2016-3955-CESUB,2016-3609-CESUB,2016-4209-CESUB,2016-5982-CESUB,2016-3622-CESUB,2016-2467-CESUB,2016-6144-CESUB,2016-6129-CESUB,2016-6142-CESUB,2016-3644-CESUB,2016-6130-CESUB,2016-3603-CESUB,2016-2457-CESUB,2016-3605-CESUB,2016-4181-CESUB,2016-4187-CESUB,2016-3969-CESUB,2015-2119-CESUB,2016-2458-CESUB,2016-3625-CESUB,2016-4173-CESUB,2015-3308-CESUB,2015-2142-CESUB,2016-6145-CESUB,2016-6117-CESUB,2016-3617-CESUB,2016-8146-CESUB,2016-2472-CESUB,2016-2908-CESUB,2016-6188-CESUB,2016-6190-CESUB,2016-6191-CESUB,2016-3627-CESUB,2016-4196-CESUB,2016-4205-CESUB,2016-4174-CESUB,2015-4670-CESUB,2016-6127-CESUB,2016-5980-CESUB,2016-8132-CESUB,2015-2130-CESUB,2016-5983-CESUB,2016-2461-CESUB,2016-4212-CESUB,2016-8128-CESUB,2016-3613-CESUB,2016-4182-CESUB,2016-4183-CESUB,2016-3612-CESUB,2016-6189-CESUB,2015-2143-CESUB,2016-6136-CESUB,2016-8138-CESUB,2016-2469-CESUB,2016-4211-CESUB,2016-3620-CESUB,2016-2462-CESUB,2016-7729-CESUB,2016-6192-CESUB,2016-7731-CESUB,2016-3642-CESUB,2016-6601-CESUB,2016-6602-CESUB,2016-2484-CESUB,2016-3639-CESUB,2016-2459-CESUB,2016-7734-CESUB,2016-2486-CESUB,2016-1832-CESUB,2016-7743-CESUB,2016-1811-CESUB,2016-6575-CESUB,2016-7056-CESUB,2016-8304-CESUB,2016-6125-CESUB,2015-4646-CESUB,2016-4204-CESUB,2016-6141-CESUB,2016-4070-CESUB,2016-2464-CESUB,2016-5978-CESUB,2016-3957-CESUB";
		String [] strArray = str.split(",");
		
		Set<String> set =  new HashSet();
		for(int i=0;i< strArray.length;i++)
		{
			if(set.add(strArray[i]))
			{
				
			}
			else{
				System.out.println(strArray[i]);
			}
		}
		
		/*Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
	}

}
