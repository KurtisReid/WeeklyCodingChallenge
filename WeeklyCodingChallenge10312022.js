//Create a function that takes the dimensions of two triangles (as arrays) and checks if the first triangle fits into the second one.
let tri1 = [1,2,4];
let hole = [1,2,6];
console.log("hello");
//Check if triangle diemnsions are possible

function checkDemenions(tri)
{
    if ((tri[0] + tri[1] > tri[2]) && (tri[0] + tri[2] > tri[1]) && (tri[2] + tri[1] > tri[0]))
    {
       
        return true;
    }
    else
    {
        
        return false;
    }
}

function doesTriangleFit(tri, hole)
{
    
    if ((tri[0] + tri[1] + tri[2]) <= (hole[0] + hole[1] + hole[2]))
    {
        
        let dem = checkDemenions(tri);
        
        return dem;
    }
    else
    {
        
        return false;
    }
}

console.log(doesTriangleFit(tri1, hole));

