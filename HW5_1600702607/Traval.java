
public class Traval
{
  int dayForTravel,countForTravel;
  double priceForTravel,allPrice;
  String desName,airplaneName,destination,answer;
  String[] travelPlanList;
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getDestination(){
        return this.destination;
    }

    public void CheckCondition(){
        switch(destination.toUpperCase())
        {
            // Choose Japan
            case "J" : this.travelPlanList = new String[] 
                {   "Tokyo – The best of modern Japan",
                    "Kyoto – The best of traditional Japan with many stunning temples to explore. ",
                    "Takayama – A smaller, quieter alternative for traditional Japan.",
                    "Hakone – For the chance to see Mount Fuji, mountain scenery, lakes, onsens.",
                    "Nikko – Stunning temples in the forest.",
                    "Hiroshima – Visit the moving peace memorial that commemorates the atomic bombing."
                };
                this.dayForTravel = 14;
                this.priceForTravel = 80000;
                this.desName = "Japan";
                this.airplaneName = "Japan Airlines";
                break;
            // Choose Hongkong
            case "H" : this.travelPlanList = new String[] 
                {   "Street Markets – Temple Street Night Market and the Ladies Market.",
                    "Central to Mid-Levels Escalator & Walkway",
                    "Chi Lin Nunnery – A series of traditional monasteries joined by an adjacent park.",
                    "Man Mo Temple – The oldest temple in Hong Kong, Man Mo is fascinating .",
                    "Sik Sik Yuen Wong Tai Sin Temple – This vibrant temple filled is incredibly photogenic.",
                    "Ten Thousand Buddhas Monastery – Occupying that odd place between reverence and kitsch.",
                    "Tsim Sha Tsui Promenade – One of our favorite things to do in Kowloon.",
                    "Hong Kong Disneyland – We’re huge Disney fans, and Hong Kong Disneyland (HKDL)",
                    "Victoria Peak – Our favorite thing to do in Hong Kong is head up to the top of the 1,811 feet tall Victoria Peak."
                };
                this.dayForTravel = 5;
                this.priceForTravel = 35000;
                this.desName = "Hongkong";
                this.airplaneName = "Cathay Pacific";
                break;
            // Choose China
            case "C" : this.travelPlanList = new String[] 
                {   "Beijing — Historic Capital Full of Cultural Heritage",
                    "Xi'an — a Window on China's Ancient Civilization",
                    "Shanghai — China's Prosperous Largest City",
                    "Guilin — China's Top Karst Landscape",
                    "Chengdu — Hometown of Giant Pandas",
                    "Hangzhou — Shanghai’s Picturesque Backyard with Rich Culture",
                    "Suzhou — Elegant Water Towns and Gardens",
                    "Huangshan — Majestic Beauty"
                };
                this.dayForTravel = 8;
                this.priceForTravel = 62000;
                this.desName = "China";
                this.airplaneName = "China Eastern Airlines";
                break;
                // Choose Thailand
            case "T" : this.travelPlanList = new String[] 
                {   "Phuket — The most island in Thailand",
                    "Tak — Most forest",
                    "Chiang Rai — Most mountain",
                    "Mae Hong Son — The most higher mountain in Thailand",
                };
                this.dayForTravel = 15;
                this.priceForTravel = 50000;
                this.desName = "Thailand";
                this.airplaneName = "Air Asia";
                break;
                // Choose Austria
                case "A" : this.travelPlanList = new String[] 
                {   "Sydney — Have signature Sydney Opera House",
                    "Salzburg — Most Castle",
                    "Salzkammergut — World Cultural Heritage Castle",
                    "Vienna — Salzkammergut",
                };
                this.dayForTravel = 7;
                this.priceForTravel = 72000;
                this.desName = "Austria";
                this.airplaneName = "Qatar Airways";
                break;
                // Choose England
                case "E" : this.travelPlanList = new String[] 
                {   "London — Have signature Big Ben",
                    "Salisbury Plain — Have signature Stonehenge",
                    "London — Most Castle",
                    "Abbey Chambers — The Roman Baths and Georgian City of Bath",
                };
                this.dayForTravel = 5;
                this.priceForTravel = 150000;
                this.desName = "England";
                this.airplaneName = "Qatar Airways";
                break;
            // Input Error 
            default : 
                this.dayForTravel = 0;
                this.priceForTravel =0;
                this.desName = "-";
                this.airplaneName = "-";
                this.travelPlanList = new String[] { };
                break;
        }
    }
    
    public void setAnswer(String answer){
        this.answer = answer;
    }
    
    public String getAnswer(){
        return this.answer;
    }
    
    public void CheckInput(){
        try {
           this.countForTravel = Integer.parseInt(answer);
           
           // Case number person <1 or >50
           if(this.countForTravel<1 || countForTravel>50)
            this.countForTravel = 1;
        } catch (NumberFormatException e) {
           this.countForTravel = 0;
        }
    }
    
    public void ComputePrice (){
        this.allPrice = this.priceForTravel * this.countForTravel;
    }
    
    public void LoopDisplay (){
        for(int lp=0;lp<travelPlanList.length;lp++)
        {
            System.out.println(Integer.toString(lp+1) + " :: " + travelPlanList[lp]);
        }
    }
}
