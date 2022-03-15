using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class LoadingBar : MonoBehaviour
{
    public GameObject foreground;
    public float currentPercent;
    public int cost;
    private Vector3 scale;
    private Vector3 pos;

    void Start()
    {
        scale = foreground.transform.localScale;
        pos = foreground.transform.localPosition;

        Vector3 position_transformed = pos;
        position_transformed.x -= scale.x / 2;
        
        foreground.transform.localPosition = position_transformed;
        foreground.transform.localScale = new Vector3(0, 1, 1);

        currentPercent = 0;
    }

    public bool setPercent(float percent)
    {
        if (currentPercent + percent > 2) return false;
        float scale_x = scale.x * percent;
        Vector3 position_transformed = pos;

        position_transformed.x -= scale.x / 2 - scale_x / 2;

        foreground.transform.localScale = new Vector3(scale_x, 1, 1);
        foreground.transform.localPosition = position_transformed;

        currentPercent = percent;

        return true;
    }
}
