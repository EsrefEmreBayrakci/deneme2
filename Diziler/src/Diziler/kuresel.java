package Diziler;

import java.util.Scanner;

public class kuresel {

	public static void main(String[] args) {
		
		String [] kontrol= {"a","b","c","d","A","B","C","D"};
		int counter=0;
		Scanner input =new Scanner(System.in);
		String cevap;
		
		
		
		System.out.println("Aşağıdakilerden hangisi küresel ısınmanın sonuçlarından biri değildir?");
		System.out.println("A) Ortalama deniz seviyesinin yükselmesi");
		System.out.println("B) Tatlı su kaynaklarının azalması");
		System.out.println("C) Buzulların artması");
		System.out.println("D) Denizlerin soğuması");
		cevap=input.next();
		
		if(cevap.equals(kontrol[2]) || cevap.equals(kontrol[6])){
				System.out.println("cevap daoğru.");
				counter+=1;
		}
		else {
			System.out.println("cevap yanlış. dogru cevap 'c' \n\n");
			
		}
		
		System.out.println("Küresel Isınma: Atmosfere salınan CO2 gibi sera etkisi yaratan gazların, yer yüzeyi ve denizlerin ortalama sıcaklığını artırmasıdır.\r\n"
				+ "\r\n"
				+ "Buna göre; aşağıdakilerden hangisi küresel ısınmaya karşı alınabilecek önlemler arasında değildir?");
		
		System.out.println("A) Ambalajları fazla olan ürünleri kullanmaktan kaçınmak");
		System.out.println("B) Ev ve iş yerinde enerji yalıtımı sağlamak");
		System.out.println("C) Yenilenemez enerji kaynaklarını kullanmayı tercih etmek");
		System.out.println("D) Otomobillerin hava ve yakıt filtrelerinin her zaman temiz olmasına dikkat etmek");
		cevap=input.next();
		
		if(cevap.equals(kontrol[2]) || cevap.equals(kontrol[6])){
			System.out.println("cevap daoğru.");
			counter+=1;
		}
		else {
			System.out.println("cevap yanlış. dogru cevap 'c' \n\n");
			
		}
		
		System.out.println("Dünya'ya Güneş'ten gelen ışınlar, karbondioksit, metan ve su buharı gibi atmosferde bulunan gazlar tarafından tutulur. Böylece Dünya'nın sıcaklığı artar.\r\n"
				+ "\r\n"
				+ "Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?");
		
		System.out.println("A) Güneş Tutulması");
		System.out.println("B) Sera Etkisi");
		System.out.println("C) Buzulların Erimesi");
		System.out.println("D) Ozon Tabakasının Delinmesi");
		cevap=input.next();
		
		if(cevap.equals(kontrol[1]) || cevap.equals(kontrol[5])){
			System.out.println("cevap daoğru.");
			counter+=1;
		}
		else {
			System.out.println("cevap yanlış. dogru cevap 'c' \n\n");
			
		}
		
		System.out.println("hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("A) jupiter");
		System.out.println("B) venus");
		System.out.println("C) mars");
		System.out.println("D) merkür");
		cevap=input.next();
		
		if(cevap.equals(kontrol[1]) || cevap.equals(kontrol[5])){
			System.out.println("cevap daoğru.");
			counter+=1;
		}
		else {
			System.out.println("cevap yanlış. dogru cevap 'c' \n\n");
			
		}
		
		System.out.println("iklim değişiklikleri ile yılda kaç kişi ölmektedir?");
		System.out.println("A) 1500");
		System.out.println("B) 100.000");
		System.out.println("C) 150.000");
		System.out.println("D) 500.000");
cevap=input.next();
		
		if(cevap.equals(kontrol[2]) || cevap.equals(kontrol[6])){
			System.out.println("cevap daoğru. \n\n");
			counter+=1;
		}
		else {
			System.out.println("cevap yanlış. dogru cevap 'c' \n\n");
			
		}
		
		System.out.printf("Dogru sayiniz : %d \n",counter);
		
		if(counter==5) {
			System.out.println("mükemmel");
		}
		else if(counter==4) {
			System.out.println("çok iyi");
		}
		else {
			System.out.println("küresel ısınma hakkında bilgilernizi tazeleme zamanı ");
		}
	}}


